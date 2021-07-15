package com.ram.Hanumanjetlibrary;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.ram.hanumanjetpacklibrery.RetroApiAnyCall;
import com.ram.hanumanjetpacklibrery.RetrofitClient;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getCategory();

    }


    private void getCategory() {

        api service = RetrofitClient.getModelClient("http://pragyatitsolutions.com/").create(api.class);


        Call<testmodel> stringCall = service.placeorder("8", "1");



        stringCall.enqueue(new Callback<testmodel>() {




            @Override
            public void onResponse(Call<testmodel> call, retrofit2.Response<testmodel> response) {

                if (response.isSuccessful()) {
                    /* */
                    switch (response.code()) {
                        case 404:

                            break;

                        case 500:

                            break;

                        case 200:
                            if (response.isSuccessful()) {

                                Log.i("PP",""+response.toString()+"");

                            }
                            break;

                        default:
                          //  callback.onError("error");
                            break;

                    }

                } else {

                }
            }

            @Override
            public void onFailure(Call<testmodel> call, Throwable t) {

                if (call.isCanceled()) {
                    //callback.onError("abort");
                } else {

                    Log.i("PP",""+t.toString()+"");
                  //  callback.onError(call.toString());
                }

            }
        });

    }


       /* RetroApiAnyCall.ApiModelCallRetro(stringCall, new RetroApiAnyCall.RetroCallbackApiModel() {
            @Override
            public void onError(String result) {
                Log.i("PP",""+result+"");
            }

            @Override
            public <E> void onSuccess(E body) {
                Log.i("PP",""+body+"");
            }
        });*/




        public  interface  api{

            @FormUrlEncoded
            @POST("pragyatschool/smartschool/SchoolApi/TeacherApi/student_details.php")
            Call<testmodel> placeorder(@Field("class_id") String id, @Field("sec_id") String secid );

        }



    }