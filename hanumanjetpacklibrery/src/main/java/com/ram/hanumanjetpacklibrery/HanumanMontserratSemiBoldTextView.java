package com.ram.hanumanjetpacklibrery;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class HanumanMontserratSemiBoldTextView extends AppCompatTextView {
    public HanumanMontserratSemiBoldTextView(Context paramContext) {
        super(paramContext);
        setFonts(paramContext);
    }

    public HanumanMontserratSemiBoldTextView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        setFonts(paramContext);
    }

    public HanumanMontserratSemiBoldTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        setFonts(paramContext);
    }

    private void setFonts(Context paramContext) {
        setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts/Montserrat-SemiBold.ttf"));
    }
}
