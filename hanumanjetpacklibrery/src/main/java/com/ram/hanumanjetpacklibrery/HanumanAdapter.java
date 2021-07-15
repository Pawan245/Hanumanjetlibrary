package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class  HanumanAdapter  <T> extends RecyclerView.Adapter< HanumanAdapter.MyViewholder> {

    HanumanAdapterCallback callback;


    public  interface HanumanAdapterCallback {
        void MyViewholder(View itemView);
       <T> void onBindViewHolder(List<T> list, HanumanAdapter<T>.MyViewholder holder, int position);
    }


    public void setOnHanumanAdapterCallback( HanumanAdapterCallback callbackt){

        this.callback = callbackt;
    }




    Context context;
    List<T> list;
    private OnItemClickListener onItemClickListener;
    int counter = 1;

    public static  int layoutname;



    public static void setlayoutid(int id){
    layoutname=id;
}



    public  HanumanAdapter(HanumanAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void OnItemClick(int Position);
    }

    public void setOnItemClickListener(OnItemClickListener Listener) {
        onItemClickListener = Listener;
    }

    public  HanumanAdapter(Context context, List<T> list1) {
        this.context = context;
        this.list = list1;
    }

    @NonNull
    @Override
    public  HanumanAdapter.MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View v = LayoutInflater.from(parent.getContext()).inflate(layoutname, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewholder vh = new MyViewholder(v);
        return vh;
    }




    @Override
    public void onBindViewHolder(@NonNull  HanumanAdapter.MyViewholder holder, int position) {
       // final T myCartmodel = list.get(position);

       // callback.onBindViewHolder(holder,position,list);


      call(list,holder,position);



    }

    private void call(List<T> list, MyViewholder holder, int position) {

        onBindMyHolder(list,holder,position,callback);
    }

    private void onBindMyHolder(List<T> list, MyViewholder holder, int position, HanumanAdapterCallback callback) {
        callback.onBindViewHolder(list,holder,position);

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {


        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            MyHolder(callback,itemView);

        }

        public void MyHolder(HanumanAdapterCallback callback, View itemView){
         callback.MyViewholder(itemView);
        }


    }





}










