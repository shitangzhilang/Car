package com.zx.car.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zx.car.bean.HomeBannerBean;

import java.util.List;

/**
 * Created by ferris.xu on 2016/7/31.
 */
public class HomeViewPageAdapter extends PagerAdapter {

    List<View>  homeBannerBeens;
    Context mContext;
    public HomeViewPageAdapter(Context mContext){
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return homeBannerBeens==null?0:homeBannerBeens.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)   {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {  //这个方法用来实例化页卡
        View mHomeBannerBean=homeBannerBeens.get(position);

        container.addView(mHomeBannerBean, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);//添加页卡
        return mHomeBannerBean;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0==arg1;//官方提示这样写
    }

    public void refresh(List<View> homeBannerBeens) {
        this.homeBannerBeens=homeBannerBeens;
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
