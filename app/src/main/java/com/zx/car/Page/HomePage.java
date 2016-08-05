package com.zx.car.Page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zx.car.R;
import com.zx.car.view.BanerPageView;
import com.zx.car.view.HomePageIndicator;
import com.zx.car.view.PadingLinearLayout;

/**
 * Created by Administrator on 2016/7/30.
 */
public class HomePage extends BasePage {
    public HomePage(Context context) {
        super(context);
    }

    public HomePage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomePage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static HomePage getXml(Context mContext) {
        return (HomePage) LayoutInflater.from(mContext).inflate(R.layout.page_home_layout, null);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //

        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);

        View pageView = findViewById(R.id.mHomePageListView);
        PadingLinearLayout mContaint = (PadingLinearLayout) findViewById(R.id.mContaint);
        BanerPageView mBanerPageView= (BanerPageView) findViewById(R.id.mBanerPageView);

        HomePageIndicator mHomePageIndicator= (HomePageIndicator) findViewById(R.id.mHomePageIndicator);

        if (pageView != null&&mContaint!=null&&mBanerPageView!=null) {
            int offset = getResources().getDimensionPixelOffset(R.dimen.home_page_home_indicator_height);
            ViewGroup.LayoutParams lp = pageView.getLayoutParams();
            if (lp != null) {
                lp.width = width;
                lp.height = height - offset-mContaint.getOffsetY()*2;
                pageView.setLayoutParams(lp);
            }

            ViewGroup.LayoutParams lp2 = mHomePageIndicator.getLayoutParams();
            if (lp2 != null) {
                lp2.height = offset +mContaint.getOffsetY();
                mHomePageIndicator.setLayoutParams(lp2);

            }

            mBanerPageView.setOffsetY(mContaint.getOffsetY());
        }


        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public void initPage() {

    }


}
