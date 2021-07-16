package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class FlipperAdapter<T> extends PagerAdapter {
    List<T> arrayList;

    Context context;

    ImageView image;

    LayoutInflater mInflater;

    String[] namesArray;

    public FlipperAdapter(Context param1Context, List<T> param1List) {
        this.context = param1Context;
        this.arrayList = param1List;
        this.mInflater = LayoutInflater.from(param1Context);
    }

    public void destroyItem(ViewGroup param1ViewGroup, int param1Int, Object param1Object) {
        param1ViewGroup.removeView((View)param1Object);
    }

    public int getCount() {
        return this.arrayList.size();
    }

    public Object instantiateItem(ViewGroup param1ViewGroup, int param1Int) {
        View view = this.mInflater.inflate(R.layout.slider_image, null);
       /* TextView textView1 = (TextView)view.findViewById(R.id. SliderimageView);
        TextView textView2 = (TextView)view.findViewById(R.id.date3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(((T)this.arrayList.get(param1Int)).getNoti());
        textView1.setText(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(((T)this.arrayList.get(param1Int)).getDate1());
        textView2.setText(stringBuilder.toString());
        if (((T)this.arrayList.get(param1Int)).getNoti().length() >5000) {
            (new ResizableCustomView2()).doResizeTextView(textView1, 4, "Continue...", true, getContext(), "");
        } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("");
            stringBuilder1.append(((T)this.arrayList.get(param1Int)).getNoti());
            textView1.setText(stringBuilder1.toString());
        }
        ((ViewPager)param1ViewGroup).addView(view);*/
        return view;
    }

    public boolean isViewFromObject(View param1View, Object param1Object) {
        return (param1View == (View)param1Object);
    }
}
