package com.ram.hanumanjetpacklibrery;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

public class HanumanCustomRelativeLayout        extends RelativeLayout
{
    private final int[] a = new int[4];

    public HanumanCustomRelativeLayout(Context paramContext)
    {
        super(paramContext);
    }

    @SuppressLint({"NewApi"})
    public HanumanCustomRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        // paramContext = paramContext.obtainStyledAttributes(paramAttributeSet,R.i);
        //int i = paramContext.getInt(0, 0);
        if ((getBackground() instanceof LevelListDrawable))
        {
            paramAttributeSet = (AttributeSet) getBackground();
            //  paramAttributeSet.setLevel(i);
            setBackground((Drawable) paramAttributeSet);
        }
        //  paramContext.registerComponentCallbacks();
    }

    public HanumanCustomRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
    }

    public final int[] getInsets()
    {
        return this.a;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
    {
        WindowInsets localWindowInsets = paramWindowInsets;
        if (Build.VERSION.SDK_INT >= 20)
        {
            this.a[0] = paramWindowInsets.getSystemWindowInsetLeft();
            this.a[1] = paramWindowInsets.getSystemWindowInsetTop();
            this.a[2] = paramWindowInsets.getSystemWindowInsetRight();
            localWindowInsets = super.onApplyWindowInsets(paramWindowInsets.replaceSystemWindowInsets(0, 0, 0, paramWindowInsets.getSystemWindowInsetBottom()));
        }
        return localWindowInsets;
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

    public void setLevel(int paramInt)
    {
        getBackground().setLevel(paramInt);
    }
}