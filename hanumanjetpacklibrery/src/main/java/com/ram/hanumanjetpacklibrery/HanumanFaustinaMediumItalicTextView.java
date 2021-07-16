package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class HanumanFaustinaMediumItalicTextView extends AppCompatTextView {
    public HanumanFaustinaMediumItalicTextView(Context paramContext) {
        super(paramContext);
        setFonts(paramContext);
    }

    public HanumanFaustinaMediumItalicTextView(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        setFonts(paramContext);
    }

    public HanumanFaustinaMediumItalicTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        setFonts(paramContext);
    }

    private void setFonts(Context paramContext) {
        setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts/Faustina-MediumItalic.ttf"));
    }
}
