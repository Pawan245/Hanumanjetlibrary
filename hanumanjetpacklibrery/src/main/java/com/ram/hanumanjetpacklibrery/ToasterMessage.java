package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){


        Toast toast= Toast.makeText(c,
                message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
