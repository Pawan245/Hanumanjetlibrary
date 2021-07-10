package com.ram.hanumanjetpacklibrery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class StartAnyActivity extends AppCompatActivity {

public void StartActivityAny(Context packageContext, Class<?> cls) {
    Intent intent = new Intent(packageContext,  cls);
    startActivity(intent);

}

}
