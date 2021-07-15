package com.ram.Hanumanjetlibrary;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ram.hanumanjetpacklibrery.HanumanAdapter;
import com.ram.hanumanjetpacklibrery.RetroApiAnyCall;
import com.ram.hanumanjetpacklibrery.RetrofitClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    HanumanAdapter fg;
    RecyclerView rvc;
TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int layoutID = R.layout.activity_main;

       Log.i("SS",""+layoutID+"");


       rvc=findViewById(R.id.category_recycler);




        getCategory();

    }


    private void getCategory() {

        api service = RetrofitClient.getModelClient("https://simplifiedcoding.net/demos/").create(api.class);


        Call<List<Hero>> stringCall = service.getHeroes();

        RetroApiAnyCall.ApiModelCallRetro(stringCall, new RetroApiAnyCall.RetroCallbackApiModel() {
            @Override
            public void onError(String result) {
                Log.i("PPZ",""+result+"");
            }

            @Override
            public <E> void onSuccess(List<E> body) {
                int layoutID = R.layout.items;
                HanumanAdapter.setlayoutid(layoutID);
                List<Hero> ty= (List<Hero>) body;

                fg = new  HanumanAdapter(MainActivity.this, ty);

                // preferenceManager.putstring(Constant.PRODUCT_COUNT, String.valueOf(cartAdapter.getItemCount()));
                rvc.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                fg.setOnHanumanAdapterCallback(new HanumanAdapter.HanumanAdapterCallback() {
                    @Override
                    public void MyViewholder(View itemView) {
                        tt = itemView.findViewById(R.id.txt);

                        tt.setText(":hhfgghfghfgfg");
                    }

                    @Override
                    public <T> void onBindViewHolder(List<T> list, HanumanAdapter<T>.MyViewholder holder, int position) {
                        TextView hh= holder.itemView.findViewById(R.id.txt);
                        hh.setText("khkhkjkjlkj");
                    }
                });

                rvc.setAdapter(fg);
                rvc.smoothScrollToPosition(0);
                //cartAdapter.setOnItemClickListener(Cart.this);
                fg .notifyDataSetChanged();

                Log.i("PP",""+ty.get(4).getName()+"");
            }
        });
     /*   stringCall.enqueue(new Callback<List<Hero>>() {




            @Override
            public void onResponse(Call<List<Hero>> call, retrofit2.Response<List<Hero>> response) {

                if (response.isSuccessful()) {
                    *//* *//*
                    switch (response.code()) {
                        case 404:

                            break;

                        case 500:

                            break;

                        case 200:
                            if (response.isSuccessful()) {

                                Log.i("PP",""+response.body()+"");

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
            public void onFailure(Call<List<Hero>> call, Throwable t) {

                if (call.isCanceled()) {
                    //callback.onError("abort");
                } else {

                    Log.i("PP",""+t.toString()+"");
                  //  callback.onError(call.toString());
                }

            }
        });*/

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


            @GET("marvel")
            Call<List<Hero>> getHeroes();

        }



    }