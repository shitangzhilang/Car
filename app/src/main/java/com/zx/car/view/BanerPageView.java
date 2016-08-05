package com.zx.car.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.zx.car.R;
import com.zx.car.adapter.HomeBannerAdapter;
import com.zx.car.bean.HomeBannerBean;
import com.zx.car.mvp.handlers.HomeBannerListem;
import com.zx.car.mvp.presenters.HomeBannerPresenter;

import java.util.List;

/**
 * Created by 广告滑动页面 on 2016/7/30.
 */
public class BanerPageView extends FrameLayout implements HomeBannerListem{
    private int offsetY;
    ViewPager mViewPager;
    HomeBannerAdapter mHomeBannerAdapter;

    HomeBannerPresenter mHomeBannerPresenter;

    public BanerPageView(Context context) {
        super(context);
        init();
    }

    public BanerPageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BanerPageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public int getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }



    public  void init(){

        mHomeBannerPresenter=new HomeBannerPresenter();
        mHomeBannerPresenter.onResume(this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mViewPager= (ViewPager) findViewById(R.id.mViewPager);
        mViewPager.setOffscreenPageLimit(8);
        mHomeBannerAdapter=new HomeBannerAdapter(getContext());
        mViewPager.setAdapter(mHomeBannerAdapter);


        //请求数据
        refreshData();
    }



    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

    }


    public void refreshData(){
        if(mHomeBannerPresenter!=null){
            mHomeBannerPresenter.requestData();
        }
    }

    @Override
    public void success(List<HomeBannerBean> homeBannerBeens) {
        if(mHomeBannerAdapter!=null)
        mHomeBannerAdapter.refresh(homeBannerBeens);
    }

    @Override
    public void error(String msg) {
        Toast.makeText(getContext(),"获取首页广告banner失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void start() {
        Toast.makeText(getContext(),"开始请求广告",Toast.LENGTH_SHORT).show();
    }
}
