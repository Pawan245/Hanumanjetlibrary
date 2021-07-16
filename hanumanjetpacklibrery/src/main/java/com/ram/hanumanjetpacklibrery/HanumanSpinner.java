package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.Map;

public class HanumanSpinner {
   // private static String g[];
   // private static String h[];
    private static View ct;

    private static PopupWindow dt;

    public static void ShowSpinner(View view, int xoff, int yoff, Context context, Map<String, String> paramst,String spinnerheadertitle,final SpinnerItemOnClick callback) {
        ct = LayoutInflater.from(context).inflate(R.layout.m_dropdown_popup, null);
        int m=0;
        String [] g = new String[paramst.size()];
        String [] h = new String[paramst.size()];



        for (Map.Entry<String, String> pair : paramst.entrySet()) {

            g[m] = pair.getKey();
            h[m] = pair.getValue();

            m++;
        }

        HanumanSpinnerAdapter c = new HanumanSpinnerAdapter(context, R.layout.m_search_exp_row, g, h, yoff, true);
        ListView contextp = ct.findViewById(R.id.lv_dd_popup);
        ((TextView) ct.findViewById(R.id.tv_dd_popup_header)).setClickable(true);
        ((TextView) ct.findViewById(R.id.tv_dd_popup_header)).setText(spinnerheadertitle);

        ((TextView) ct.findViewById(R.id.tv_dd_popup_header)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callback.SetHeader();
                hidep();
                return;
            }
        });


        contextp.setAdapter(c);
        contextp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                                                // TODO Auto-generated method stub


                                                callback.onItemClick(c.getA()[position],adapter.getItemAtPosition(position).toString());




                                                hidep();
                                            }
                                        }
        );


        ViewGroup viewgroup = (ViewGroup) ct.getParent();
        if (viewgroup != null) {
            viewgroup.removeView(ct);
        }
        dt = new PopupWindow(ct, view.getWidth(), -2, true);
        dt.setOutsideTouchable(true);
        dt.setWidth(view.getWidth());
        dt.setBackgroundDrawable(new BitmapDrawable(null, ""));
        dt.setContentView(ct);
        dt.showAsDropDown(view, xoff, yoff);
    }


    public interface SpinnerItemOnClick{
        void onItemClick(String key,String value);
        void SetHeader();
    }







    public static  void hidep() {
        if ((dt != null) && (dt.isShowing())) {
            dt.dismiss();
        }
    }
}