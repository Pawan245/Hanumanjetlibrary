package com.ram.hanumanjetpacklibrery;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class HanumanCustomViewPager    extends ViewPager
{
    private boolean d = true;

    public HanumanCustomViewPager(Context paramContext)
    {
        super(paramContext);
    }

    public HanumanCustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
        return (this.d) && (super.onInterceptTouchEvent(paramMotionEvent));
    }

    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
        return (this.d) && (super.onTouchEvent(paramMotionEvent));
    }

    public void setHorizontalPagingEnabled(boolean paramBoolean)
    {
        this.d = paramBoolean;
    }
}