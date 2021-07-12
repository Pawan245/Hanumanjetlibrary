package com.ram.hanumanjetpacklibrery;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

import androidx.appcompat.widget.AppCompatTextView;

public class HanumanCustomTextView        extends AppCompatTextView
{
    public HanumanCustomTextView(Context paramContext)
    {
        super(paramContext);
        if (!isInEditMode()) {}
    }

    @SuppressLint({"NewApi"})
    public HanumanCustomTextView(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        // paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, CustomTextView);
        //int i = paramContext.getDir(0, 0);
        if ((getBackground() instanceof LevelListDrawable))
        {
            paramAttributeSet = (AttributeSet) getBackground();

            setBackground((Drawable) paramAttributeSet);
        }
        // paramContext.recycle();
    }

    public HanumanCustomTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
        if (!isInEditMode()) {}
    }

    @SuppressLint({"NewApi"})
    public void setBackground(Drawable paramDrawable)
    {
        int[] arrayOfInt = new int[4];
        arrayOfInt[0] = getPaddingLeft();
        arrayOfInt[1] = getPaddingTop();
        arrayOfInt[2] = getPaddingRight();
        arrayOfInt[3] = getPaddingBottom();
        if (Build.VERSION.SDK_INT < 16)
        {
            setBackgroundDrawable(paramDrawable);
            setPadding(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
            return;
        }
        super.setBackground(paramDrawable);
        super.setPadding(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
    }

    public void setEnabled(boolean paramBoolean)
    {
        if (!paramBoolean) {
            setLevel(3);
        }
        for (;;)
        {
            super.setEnabled(paramBoolean);
            return;
        }
    }

    public void setLevel(int paramInt)
    {
        Drawable localDrawable = getBackground();
        if (localDrawable != null) {
            localDrawable.setLevel(paramInt);
        }
    }

    public void setVisibility(int paramInt)
    {
        super.setVisibility(paramInt);
        ViewParent localViewParent = getParent();
        if ((localViewParent instanceof View)) {
            //  ((View)localViewParent).a(this, paramInt);
        }
    }
}