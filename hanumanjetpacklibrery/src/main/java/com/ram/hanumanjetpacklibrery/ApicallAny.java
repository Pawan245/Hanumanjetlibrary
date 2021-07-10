package com.ram.hanumanjetpacklibrery;

import android.content.Context;

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
   public  String result="na";

    public  String ApicallVolley(Context c, String url,  Map<String, String> paramst) {


        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                result=response.toString();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                result=error.toString();
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
