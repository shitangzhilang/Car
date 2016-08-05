package com.zx.car.Page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/7/30.
 */
public abstract  class BasePage extends FrameLayout {
    public BasePage(Context context) {
        super(context);
    }

    public BasePage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BasePage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract  void initPage();

    public void onPause(){

    }

    public void onResume(){

    }

    public  void show(){

        setVisibility(View.VISIBLE);
    }
    public  void hide(){
        setVisibility(View.GONE);
    }
}
