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

    public static  void ApicallVolleywithoutParams(Context c, String url,final VolleyCallback callback) {





        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callback.onSuccess(response);

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                callback.onError(error.toString());

                // Toast.makeText(getApplicationContext(), "Something went Wrong", Toast.LENGTH_SHORT).show();
            }
        }) ;

        RequestQueue mRequestQueue = Volley.newRequestQueue(c);
        mRequestQueue.add(stringRequest);


    }




    public static  void ApicallVolleywithParams(Context c, String url,  Map<String, String> paramst,final VolleyCallback callback) {






        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callback.onSuccess(response);



            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                callback.onError(error.toString());

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


    }







    public interface VolleyCallback{
        void onSuccess(String result);
        void onError(String result);
    }

}
