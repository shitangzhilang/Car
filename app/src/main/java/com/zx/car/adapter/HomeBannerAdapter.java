package com.zx.car.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zx.car.bean.HomeBannerBean;

import java.util.List;

/**
 * Created by ferris.xu on 2016/7/31.
 */
public class HomeBannerAdapter extends PagerAdapter {

    List<HomeBannerBean>  homeBannerBeens;
    Context mContext;
    public HomeBannerAdapter(Context mContext){
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
    public Object instantiateItem(ViewGroup container, int position) {
        HomeBannerBean mHomeBannerBean=homeBannerBeens.get(position);
        ImageView banner=new ImageView(mContext);
        banner.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(mContext).load(mHomeBannerBean.getAd_imgs()).into(banner);
        container.addView(banner, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);//���ҳ��
        return banner;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0==arg1;
    }

    public void refresh(List<HomeBannerBean> homeBannerBeens) {
        this.homeBannerBeens=homeBannerBeens;
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
