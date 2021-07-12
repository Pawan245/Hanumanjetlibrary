package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;



public class HanumanExpandableTextView     extends HanumanCustomTextView
{
    private CharSequence a;
    private CharSequence b;
    private TextView.BufferType c;
    private boolean d = true;
    private int e;

    public HanumanExpandableTextView (Context paramContext)
    {
        this(paramContext, null);
    }

    public HanumanExpandableTextView (Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
        this.e=200;

        //  paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.length());
        //  this.e = paramContext.getInt(0, 200);
        // paramContext.recycle();
    }

    private CharSequence a(CharSequence paramCharSequence)
    {
        if ((this.a != null) && (this.a.length() > this.e)) {
            return new SpannableStringBuilder(this.a, 0, this.e + 1).append(".....");
        }
        return this.a;
    }

    private void b()
    {
        super.setText(getDisplayableText(), this.c);
    }

    private CharSequence getDisplayableText()
    {
        if (this.d) {
            return this.b;
        }
        return this.a;
    }

    public void a()
    {
        if (!this.d) {}
        for (boolean bool = true;; bool = false)
        {
            this.d = bool;
            b();
            requestFocusFromTouch();
            return;
        }
    }

    public CharSequence getOriginalText()
    {
        return this.a;
    }

    public int getTrimLength()
    {
        return this.e;
    }

    public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
    {
        this.a = paramCharSequence;
        this.b = a(paramCharSequence);
        this.c = paramBufferType;
        b();
    }

    public void setTrimLength(int paramInt)
    {
        this.e = paramInt;
        this.b = a(this.a);
        b();
    }
}