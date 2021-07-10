package com.ram.hanumanjetpacklibrery;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    private static Retrofit retrofit2 = null;
    public static Retrofit getClient(String baseUrl) {



        try {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
        catch (Exception ex)
        {

        }
        return  null;
    }



    static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(600, TimeUnit.SECONDS)
            .build();




    public static Retrofit getClient2(String baseUrl) {

        try {
            if (retrofit2 == null) {
                retrofit2 = new Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .client(okHttpClient2)
                        .addConverterFactory(ScalarsConverterFactory.create())
                        .build();
            }
            return retrofit2;
        }
        catch (Exception ex)
        {

        }
        return  null;
    }

    static final OkHttpClient okHttpClient2 = new OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(600, TimeUnit.SECONDS)
            .build();

}