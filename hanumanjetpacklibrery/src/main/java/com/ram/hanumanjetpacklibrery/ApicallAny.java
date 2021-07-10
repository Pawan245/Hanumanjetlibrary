package com.ram.hanumanjetpacklibrery;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.Gravity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApicallAny {
     public static   String result="na";
    public static ProgressDialog progressDialog;
    public static  String ApicallVolleywithoutParams(Context c, String url) {


        progressDialog = new ProgressDialog(c);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setGravity(Gravity.CENTER);
        progressDialog.show();




        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                result=response.toString();
                progressDialog.dismiss();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                result=error.toString();
                progressDialog.dismiss();
                // Toast.makeText(getApplicationContext(), "Something went Wrong", Toast.LENGTH_SHORT).show();
            }
        }) ;

        RequestQueue mRequestQueue = Volley.newRequestQueue(c);
        mRequestQueue.add(stringRequest);

     return result;
    }




    public static  String ApicallVolleywithParams(Context c, String url,  Map<String, String> paramst) {


        progressDialog = new ProgressDialog(c);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setGravity(Gravity.CENTER);
        progressDialog.show();




        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                result=response.toString();

                progressDialog.dismiss();


            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                result=error.toString();
                progressDialog.dismiss();
                // Toast.makeText(getApplicationContext(), "Something went Wrong", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params=  paramst;
                return params;
            }
        };

        RequestQueue mRequestQueue = Volley.newRequestQueue(c);
        mRequestQueue.add(stringRequest);

        return result;
    }
}
