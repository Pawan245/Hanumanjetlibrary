package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.textfield.TextInputLayout;


public class HanumanCustomEditText extends AppCompatEditText
{
    private a a;

    public HanumanCustomEditText(Context paramContext)
    {
        super(paramContext);
    }

    public HanumanCustomEditText(Context paramContext, AttributeSet paramAttributeSet)
    {
        super(paramContext, paramAttributeSet);
    }

    public HanumanCustomEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
        super(paramContext, paramAttributeSet, paramInt);
    }

    public void a()
    {
        setSelection(getText().length());
    }



    public void b()
    {
        this.a = null;
    }

    protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
        super.onFocusChanged(paramBoolean, paramInt, paramRect);
        if ((!paramBoolean) && (this.a != null)) {
            this.a.a(this, getText().toString());
        }
    }

    public void setLevel(int paramInt) {}

    public void setOnValidationListener(a parama)
    {
        this.a = parama;
    }

    public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
    {
        Object localObject = getParent();
        if ((localObject instanceof TextInputLayout))
        {
            localObject = localObject;
            ((TextInputLayout)localObject).setHintAnimationEnabled(false);
            super.setText(paramCharSequence, paramBufferType);
            ((TextInputLayout)localObject).setHintAnimationEnabled(true);
            return;
        }
        super.setText(paramCharSequence, paramBufferType);
    }

    public interface a
    {
        void a(View paramView, CharSequence paramCharSequence);
    }
}
