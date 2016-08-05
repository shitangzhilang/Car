package com.zx.car.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zx.car.R;

/**
 * Created by ferris.xu on 2016/7/30.
 */
public class HomeMenuItemLayout extends LinearLayout {
    Drawable mSelectorDrawable;
    Drawable mNomalDrawable;
    String title;
    ImageView ivIcon;
    TextView tvTitle;

    public HomeMenuItemLayout(Context context) {
        super(context);
        init(null, 0);
    }

    public HomeMenuItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public HomeMenuItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    public void init(AttributeSet attrs, int defStyle) {
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.MenuItemAttrs, defStyle, 0);
        mSelectorDrawable = a.getDrawable(R.styleable.MenuItemAttrs_selector);
        mNomalDrawable = a.getDrawable(R.styleable.MenuItemAttrs_nomal);
        title = a.getString(R.styleable.MenuItemAttrs_title2);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        for(int i=0;i<getChildCount();i++){
            View mView=getChildAt(i);
            if(mView instanceof  TextView){
                tvTitle= (TextView) mView;
            }else{
                ivIcon= (ImageView) mView;
            }
        }

        tvTitle.setText(title);
        selector(false);
    }

    /**
     * 是否选中
     * @param isSelector
     */
    public void selector(boolean isSelector) {
        if (isSelector) {
            ivIcon.setImageDrawable(mSelectorDrawable);
        } else {
            ivIcon.setImageDrawable(mNomalDrawable);
        }
    }

}
