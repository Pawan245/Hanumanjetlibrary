package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ExitFromEntireApp extends AppCompatActivity {


    public  void ExitAll(Context c, String Title,String Message) {

        new AlertDialog.Builder(c)
                .setTitle(""+Title+"")
                .setMessage(""+Message+"")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 21) {
                            finishAffinity();
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            finishAndRemoveTask();
                        }

                    }
                }).create().show();
    }






}
