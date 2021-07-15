package com.ram.Hanumanjetlibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.TextView;
import android.widget.Toast;

import com.ram.hanumanjetpacklibrery.HanumanAdapter;
import com.ram.hanumanjetpacklibrery.RetroApiAnyCall;
import com.ram.hanumanjetpacklibrery.RetrofitClient;

import java.util.ArrayList;
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
    List<Hero> ty,yy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int layoutID = R.layout.activity_main;

        Log.i("SS", "" + layoutID + "");

ty=new ArrayList<>();
        yy=new ArrayList<>();
        rvc = findViewById(R.id.category_recycler);




        getCategory();

    }


    private void getCategory() {

        api service = RetrofitClient.getModelClient("https://simplifiedcoding.net/demos/").create(api.class);


        Call<List<Hero>> stringCall = service.getHeroes();

        RetroApiAnyCall.ApiModelCallRetro(stringCall, new RetroApiAnyCall.RetroCallbackApiModel() {
            @Override
            public void onError(String result) {
                Log.i("PPZ", "" + result + "");
            }

            @Override
            public <E> void onSuccess(List<E> body) {
                int layoutID = R.layout.items;
                HanumanAdapter.setlayoutid(layoutID);
                ty = (List<Hero>) body;
yy= (List<Hero>) body;
                fg = new HanumanAdapter(MainActivity.this, ty);

                // preferenceManager.putstring(Constant.PRODUCT_COUNT, String.valueOf(cartAdapter.getItemCount()));
                rvc.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                rvc.setAdapter(fg);
                rvc.smoothScrollToPosition(0);
                //cartAdapter.setOnItemClickListener(Cart.this);
                fg.notifyDataSetChanged();


                fg.setOnHanumanAdapterCallback(new HanumanAdapter.HanumanAdapterCallback() {
                    @Override
                    public void MyViewholder(View itemView) {
                        tt = itemView.findViewById(R.id.txt);
                    }

                    @Override
                    public <T> void onBindViewHolder(List<T> list, HanumanAdapter<T>.MyViewholder holder, int position) {
                        List<Hero> df = (List<Hero>) list;
                        TextView hh = holder.itemView.findViewById(R.id.txt);
                        hh.setText("" + df.get(position).getName() + "");
                        hh.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                              //  Toast.makeText(getApplicationContext(),""+hh.getText().toString()+"",Toast.LENGTH_LONG).show();

                                EditText ty = findViewById(R.id.txtm);

fg.getFilter().filter(ty.getText().toString());
                            }

                        });
                    }

                    @Override
                    public void filterresult(CharSequence constraint) {



                       if (constraint.length() > 0) {
                            constraint = constraint.toString().toUpperCase();
                            ArrayList<Hero> filter = new ArrayList<Hero>();
                            for (int i = 0; i < ty.size(); i++) {
                                if (ty.get(i).getName().toUpperCase().equals(constraint)) {
                                    Toast.makeText(getApplicationContext(),""+constraint+"",Toast.LENGTH_LONG).show();

                                    Hero p = new Hero(ty.get(i).getName(), ty.get(i).getRealname(), ty.get(i).getTeam(), ty.get(i).getFirstappearance(), ty.get(i).getCreatedby(), ty.get(i).getPublisher(), ty.get(i).getImageurl(), ty.get(i).getBio());
                                    filter.add(p);

                                }
                            }
ty.clear();

                           Toast.makeText(getApplicationContext(),""+filter.size()+"",Toast.LENGTH_LONG).show();

                            ty=filter;

                           fg.notifyDataSetChanged();



                        } else {

ty.clear();
ty=yy;
                           fg.notifyDataSetChanged();

                        }
                    }
                });


                // Log.i("PP", "" + ty.get(4).getName() + "");


            }


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


    public interface api {


        @GET("marvel")
        Call<List<Hero>> getHeroes();

    }


}