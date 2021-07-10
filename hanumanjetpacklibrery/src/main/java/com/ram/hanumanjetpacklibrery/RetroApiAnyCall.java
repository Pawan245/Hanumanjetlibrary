package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.Map;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroApiAnyCall {


    public static  void ApicallRetro(Call<String> data,final RetroCallbackapi callback){


        /********************************************************************************************/


      //  WebAPIService:

      //  @GET("/api/values")
      //  Call<String> getValues();
      //  Activity file:

      //  Retrofit retrofit = new Retrofit.Builder()
         //       .baseUrl(API_URL_BASE)
          //      .build();

      //  WebAPIService service = retrofit.create(WebAPIService.class);

      //  Call<String> stringCall = service.getValues();






        /*********************************************************************************************/

        data.enqueue(new Callback<String>() {

        @Override
        public void onResponse(Call<String> call, retrofit2.Response<String> response) {

            if (response.isSuccessful()) {
                /* */
                switch (response.code()) {
                    case 404:
                        callback.onError("404");
                        break;

                    case 500:
                        callback.onError("500");
                        break;

                    case 200:
                        if (response.isSuccessful()) {

                            callback.onSuccess(response.toString());

                        }
                        break;

                    default:
                        callback.onError("error");
                        break;

                }

            } else {

            }
        }

        @Override
        public void onFailure(Call<String> call, Throwable t) {

            if (call.isCanceled()) {
                callback.onError("abort");
            } else {
                callback.onError("abortcancel");
            }

        }
    });

}





    public interface RetroCallbackapi{
        void onSuccess(String result);
        void onError(String result);




    }








        }




