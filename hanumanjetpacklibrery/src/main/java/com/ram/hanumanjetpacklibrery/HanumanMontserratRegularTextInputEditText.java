package com.ram.hanumanjetpacklibrery;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;

public class HanumanMontserratRegularTextInputEditText extends TextInputEditText {
    public HanumanMontserratRegularTextInputEditText(Context paramContext) {
        super(paramContext);
        setFonts(paramContext);
    }

    public HanumanMontserratRegularTextInputEditText(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        setFonts(paramContext);
    }

    public HanumanMontserratRegularTextInputEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        setFonts(paramContext);
    }

    private void setFonts(Context paramContext) {
        setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts/Montserrat-Regular.ttf"));
    }
}
