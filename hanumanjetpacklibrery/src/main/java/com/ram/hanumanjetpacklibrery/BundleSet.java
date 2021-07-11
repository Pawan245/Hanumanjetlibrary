package com.ram.hanumanjetpacklibrery;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Map;

public class BundleSet extends AppCompatActivity {



    public static Bundle SetBundleString(Map<String, String> paramst) {

        Bundle bundle = new Bundle();
        bundle.clear();

        if(paramst.size()>0) {



            for (Map.Entry<String, String> pair : paramst.entrySet()) {
                bundle.putString("" + pair.getKey() + "", "" + pair.getValue() + "");
            }

            return bundle;

        }

        return bundle;

    }

}
