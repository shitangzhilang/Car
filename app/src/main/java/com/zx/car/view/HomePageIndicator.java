package com.zx.car.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.zx.car.R;

/**
 * Created by ferris.xu on 2016/7/30.
 */
public class HomePageIndicator extends FrameLayout {
    ImageView iv_bg;
    TextView tv_hot,tv_new;

    Drawable mHotDrawable,mNewDrawable;

    public IndicatorChageListem getIndicatorChageListem() {
        return indicatorChageListem;
    }

    public void setIndicatorChageListem(IndicatorChageListem indicatorChageListem) {
        this.indicatorChageListem = indicatorChageListem;
    }

    IndicatorChageListem indicatorChageListem;

    public HomePageIndicator(Context context) {
        super(context);
    }

    public HomePageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomePageIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        iv_bg= (ImageView) findViewById(R.id.iv_bg);
        tv_hot= (TextView) findViewById(R.id.tv_hot);
        tv_new= (TextView) findViewById(R.id.tv_new);
        mHotDrawable=getResources().getDrawable(R.drawable.hot_indicator);
        mNewDrawable=getResources().getDrawable(R.drawable.new_indicator);
        tv_hot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_bg.setBackground(mNewDrawable);
              if(indicatorChageListem!=null)
                indicatorChageListem.chage(0);
            }
        });

        tv_new.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_bg.setBackground(mHotDrawable);
                if(indicatorChageListem!=null)
                indicatorChageListem.chage(1);
            }
        });
        iv_bg.setBackground(mNewDrawable);
    }

    public void selector(boolean selector){
        if(selector){
            iv_bg.setBackground(mHotDrawable);
        }else{
            iv_bg.setBackground(mNewDrawable);
        }
    }
    public interface  IndicatorChageListem{
        void chage(int position);
    }
}
