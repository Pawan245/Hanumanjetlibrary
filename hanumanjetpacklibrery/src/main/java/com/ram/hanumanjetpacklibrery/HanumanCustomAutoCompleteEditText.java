package com.ram.hanumanjetpacklibrery;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class HanumanCustomAutoCompleteEditText  extends AppCompatEditText {

        private HanumanCustomEditText.a a;

        public HanumanCustomAutoCompleteEditText(Context paramContext)
        {
            super(paramContext);
        }

        public HanumanCustomAutoCompleteEditText(Context paramContext, AttributeSet paramAttributeSet)
        {
            super(paramContext, paramAttributeSet);
        }

        public HanumanCustomAutoCompleteEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
        {
            super(paramContext, paramAttributeSet, paramInt);
        }

        protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
        {
            super.onFocusChanged(paramBoolean, paramInt, paramRect);
            if ((!paramBoolean) && (this.a != null)) {
                this.a.a(this, getText().toString());
            }
        }

        public void setLevel(int paramInt)
        {
            getBackground().setLevel(paramInt);
        }

        public void setOnValidationListener(HanumanCustomEditText.a parama)
        {
            this.a = parama;
        }
}
