package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class  HanumanAdapter  <T> extends RecyclerView.Adapter< HanumanAdapter.MyViewholder>   implements Filterable {

    HanumanAdapterCallback callback;

    public void SetHanumanAdapter( HanumanAdapterCallback callbackt){

        this.callback = callbackt;
    }

     List<T> FilterList;
    CustomFilter filter;


    @Override
    public Filter getFilter() {
        if(filter==null)
        {
            filter= new CustomFilter();
        }
        return  filter;


    }

    class CustomFilter extends Filter
    {

        @Override
        protected FilterResults performFiltering(CharSequence  constraint) {



            FilterResults results = new FilterResults();


            return results;





        }



        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            list=  callback.filterresult(constraint);
            notifyDataSetChanged();
        }
    }


    public  interface HanumanAdapterCallback {

        int setlayoutid();

        void MyViewholder(View itemView);
       <T> void onBindViewHolder(List<T> list, HanumanAdapter<T>.MyViewholder holder, int position);

      <T> List<T>  filterresult(CharSequence constraint);


    }







    Context context;
    List<T> list;
    private OnItemClickListener onItemClickListener;
    int counter = 1;

    public static  int layoutname;



   /* public static void setlayoutid(int id){
    layoutname=id;
}*/



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
        this.FilterList = list1;
    }

    @NonNull
    @Override
    public  HanumanAdapter.MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        layoutname=callback.setlayoutid();

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










