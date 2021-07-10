package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class BundleSet extends AppCompatActivity {



    public  Bundle SetBundleString(Map<String, String> paramst) {
        Bundle bundle = new Bundle();
        bundle.clear();
        Map<String, String> map =  new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
             bundle.putString(""+pair.getKey()+"", ""+pair.getValue()+"");
             }

       return bundle;



    }

}
