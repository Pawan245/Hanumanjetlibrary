package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class HanumanCustomTextInputLayout
        extends TextInputLayout
{
    private View e;

    public HanumanCustomTextInputLayout(Context paramContext)
    {
        this(paramContext, null);
    }

    public HanumanCustomTextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
        this(paramContext, paramAttributeSet, 0);
    }

    public HanumanCustomTextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
    }

    private void setTextWatcherEditText(EditText paramEditText) {}

    public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
    {
        super.addView(paramView, paramInt, paramLayoutParams);
        if ((paramView instanceof EditText)) {
            setTextWatcherEditText((EditText)paramView);
        }
    }

    public void setError(CharSequence paramCharSequence)
    {
        super.setError(paramCharSequence);

        return;

    }
}