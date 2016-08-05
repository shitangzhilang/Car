package com.zx.car.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.zx.car.R;

/**
 * Created by Administrator on 2016/7/30.
 */
public class PadingLinearLayout extends LinearLayout {

    HomePageIndicator indicator;
    HomeViewPage mHomeViewPage;
    public int getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    private int offsetY=0;

    public PadingLinearLayout(Context context) {
        super(context);
    }

    public PadingLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PadingLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        indicator= (HomePageIndicator) findViewById(R.id.mHomePageIndicator);
        indicator.setIndicatorChageListem(new HomePageIndicator.IndicatorChageListem() {
            @Override
            public void chage(int position) {
                mHomeViewPage.setCurrentItem(position);
            }
        });
        mHomeViewPage= (HomeViewPage) findViewById(R.id.mHomePageListView);
        mHomeViewPage.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                indicator.selector(position==0?false:true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
