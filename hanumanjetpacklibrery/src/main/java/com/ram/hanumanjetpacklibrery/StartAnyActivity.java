package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public  class StartAnyActivity<T> extends AppCompatActivity {

public void startActivityAnyAndFinish(Context packageContext, Class<T> cls) {
    Intent intent = new Intent(packageContext,  cls);
    startActivity(intent);
    finish();

}

    public void startActivityAny(Context packageContext, Class<T> cls) {
        Intent intent = new Intent(packageContext,  cls);
        startActivity(intent);
    }




}
