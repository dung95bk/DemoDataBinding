package com.example.databindingdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TextViewCustom extends TextView {
    public TextViewCustom(Context context) {
        super(context);
    }

    public TextViewCustom(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setInputType(int type) {
        super.setInputType(type);
    }

    @Override
    public void setRawInputType(int type) {
        super.setRawInputType(type);
    }

    @Override
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
    }

    public void setMaxLines2(int maxLines) {
        Log.e("ADĐ", "setMaxLine2");
    }
}


