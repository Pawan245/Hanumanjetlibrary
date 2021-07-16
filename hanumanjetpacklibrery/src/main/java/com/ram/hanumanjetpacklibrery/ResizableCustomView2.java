package com.ram.hanumanjetpacklibrery;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;


public class ResizableCustomView2 {
    AlertDialog alertDialog;

    Context context;

    String date4;

    private SpannableStringBuilder addClickablePartTextViewResizable(Spanned paramSpanned, final TextView tv, int paramInt, String paramString, final boolean viewMore) {
        String str = paramSpanned.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)paramSpanned);
        if (str.contains(paramString))
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public void onClick(View param1View) {
                    if (viewMore) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ResizableCustomView2.this.context);
                        View view = LayoutInflater.from(ResizableCustomView2.this.context).inflate(R.layout.custom_dial2, null);
                        builder.setCustomTitle(view);
                        ((TextView)view.findViewById(R.id.text_m)).setText(tv.getTag().toString(), TextView.BufferType.SPANNABLE);
                        ResizableCustomView2.this.doResizeTextView(tv, 4, "Continue...", true, ResizableCustomView2.this.context, "");
                        ResizableCustomView2.this.alertDialog = builder.create();
                       // (ResizableCustomView2.this.alertDialog.getWindow().getAttributes()).windowAnimations =DialogTheme;
                        ResizableCustomView2.this.alertDialog.show();
                    }
                }
            },str.indexOf(paramString), str.indexOf(paramString) + paramString.length(), 0);
        return spannableStringBuilder;
    }

    public void doResizeTextView(final TextView tv, final int maxLine, final String expandText, final boolean viewMore, Context paramContext, String paramString2) {
        this.context = paramContext;
        this.date4 = paramString2;
        if (tv.getTag() == null)
            tv.setTag(tv.getText());
        tv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                int bool;
                CharSequence charSequence;
                tv.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (maxLine == 0) {
                    bool = tv.getLayout().getLineEnd(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(tv.getText().subSequence(0, bool - expandText.length()));
                    stringBuilder.append(" ");
                    stringBuilder.append(expandText);
                    charSequence = stringBuilder.toString();
                } else if (maxLine > 0 && tv.getLineCount() >= maxLine) {
                    bool = tv.getLayout().getLineEnd(1);
                    StringBuilder stringBuilder = new StringBuilder();
                   stringBuilder.append(tv.getText().subSequence(0, bool - expandText.length()));
                    stringBuilder.append(" ");
                    stringBuilder.append(expandText);
                    charSequence = stringBuilder.toString();
                } else {
                    charSequence = null;
                    bool = 0;
                }
                tv.setText(charSequence);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
                tv.setText((CharSequence)ResizableCustomView2.this.addClickablePartTextViewResizable(Html.fromHtml(tv.getText().toString()), tv, bool, expandText, viewMore), TextView.BufferType.SPANNABLE);
            }
        });
    }
}
