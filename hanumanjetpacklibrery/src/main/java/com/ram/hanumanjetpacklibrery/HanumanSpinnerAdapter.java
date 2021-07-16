package com.ram.hanumanjetpacklibrery;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class HanumanSpinnerAdapter extends ArrayAdapter
{

    public String[] getA() {
        return a;
    }

    public void setA(String[] a) {
        HanumanSpinnerAdapter.a = a;
    }



    public static String[] a;
    private final int b;
    private String c;
    private boolean d;

    public HanumanSpinnerAdapter(Context context, int i, String[] as, int j)
    {
        super(context, i, as);
        d = false;
        b = j;
    }

    public HanumanSpinnerAdapter(Context context, int i, String[] as, String[] as1, int j, boolean flag)
    {
        this(context, i, as, j);
        d = flag;
        a = as1;
    }

    public void a(String s)
    {
        c = s;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if(d && a[i].equals(c) || !d && i == b)
        {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.seperator_color));

            return view;
        } else
        {
            view.setBackgroundColor(getContext().getResources().getColor(R.color.white));


            return view;
        }
    }
}