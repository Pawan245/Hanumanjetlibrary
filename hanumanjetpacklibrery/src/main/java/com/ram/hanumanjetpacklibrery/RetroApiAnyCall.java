package com.ram.hanumanjetpacklibrery;
import retrofit2.Call;
import retrofit2.Callback;


public class RetroApiAnyCall {



    public static  void ApiStringCallRetro(Call<String> data,final RetroCallbackApi callback){


        /********************************************************************************************/


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

                            callback.onSuccess(response.body());

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




    public static  void ApiModelCallRetro(Call<Object> data,final RetroCallbackApiModel callback){


        /********************************************************************************************/


        data.enqueue(new Callback<Object>() {

            @Override
            public void onResponse(Call<Object> call, retrofit2.Response<Object> response) {

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

                                callback.onSuccess(response.body());

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
            public void onFailure(Call<Object> call, Throwable t) {

                if (call.isCanceled()) {
                    callback.onError("abort");
                } else {
                    callback.onError("abortcancel");
                }

            }
        });

    }


    public interface RetroCallbackApi {
        void onSuccess(String result);

        void onError(String result);
    }

    public interface RetroCallbackApiModel {
        void onSuccess(Object result);
        void onError(String result);
    }



        }













