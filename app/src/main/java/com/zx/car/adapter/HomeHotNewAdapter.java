package com.zx.car.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zx.car.R;
import com.zx.car.bean.CarBean;
import com.zx.car.bean.CardBean;
import com.zx.car.bean.HomeBannerBean;
import com.zx.car.bean.TogetherBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ferris.xu on 2016/7/31.
 */
public class HomeHotNewAdapter extends BaseAdapter {

    List<TogetherBean> mTogetherBeans;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public HomeHotNewAdapter(Context mContext) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    public void clearData(){
        if(mTogetherBeans!=null){
            mTogetherBeans.clear();
        }
        notifyDataSetChanged();
    }

    public void update(List<TogetherBean> list) {
        if (mTogetherBeans == null) {
            mTogetherBeans = list;
        } else {
            mTogetherBeans.addAll(list);
        }
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return mTogetherBeans==null?0:mTogetherBeans.size();
    }

    @Override
    public TogetherBean getItem(int position) {
        return mTogetherBeans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return mTogetherBeans.get(position).getCardType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = null;
        int type = getItemViewType(position);
        if (convertView == null) {
            mViewHolder = onCreateViewHolder(convertView, parent, type);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        onBindViewHolder(mViewHolder, type,position);
        return mViewHolder.itemView;
    }

    public ViewHolder onCreateViewHolder(View convertView, ViewGroup parent, int i) {

        ViewHolder holer = null;
        switch (i) {

            case CardBean.CAR_ITEM:
                convertView = mLayoutInflater.inflate(
                        R.layout.card_item_line, parent, false);
                holer = new AdHolder(convertView);
                convertView.setTag(holer);
                break;

            case CardBean.BANR_ITEM:
                convertView = mLayoutInflater.inflate(
                        R.layout.card_item_banner, parent, false);
                holer = new AdBannerHolder(convertView);
                convertView.setTag(holer);
                break;

        }

        return holer;

    }

    public void onBindViewHolder(ViewHolder masonryView, int type,int position) {

        switch (type) {
            //hubii标题长卡片
            case CardBean.CAR_ITEM:
                AdHolder mAdLongTitleHolder = (AdHolder) masonryView;
                TogetherBean mPopularbean =getItem(position);

                List<CardBean> mCardBeans=mPopularbean.getmCardBean();
                if(mCardBeans!=null&&mCardBeans.size()>0){

                    CarBean mCarBean1= (CarBean) mCardBeans.get(0);
                    mAdLongTitleHolder.tv_title.setText(mCarBean1.getCar_all_title());
                    Glide.with(mContext)
                            .load(mCarBean1.getCar_coverimgs())
                            .into(mAdLongTitleHolder.iv_iamges);

                    if(mCardBeans.size()>1){
                        CarBean mCarBean2= (CarBean) mCardBeans.get(1);
                        mAdLongTitleHolder.tv_title2.setText(mCarBean2.getCar_all_title());
                        Glide.with(mContext)
                                .load(mCarBean2.getCar_coverimgs())
                                .into(mAdLongTitleHolder.iv_iamges2);

                    }

                }

                break;
            //hubii标题短卡片
            case CardBean.BANR_ITEM:
                AdBannerHolder mAdShortTitleHolder = (AdBannerHolder) masonryView;
                TogetherBean mPopularbean2 =getItem(position);

                break;


        }

    }



    //普通卡片
    public static class AdHolder extends ViewHolder {
        public ImageView iv_iamges;
        public TextView tv_title;
        public TextView tv_sub;
        public TextView iv_xianche;
        public ImageView checkBox;
        public TextView tv_heart;
        public ImageView iv_eye;
        public TextView tv_eye;
        public TextView tv_price;
        //
        public ImageView iv_iamges2;
        public TextView tv_title2;
        public TextView tv_sub2;
        public TextView iv_xianche2;
        public ImageView checkBox2;
        public TextView tv_heart2;
        public ImageView iv_eye2;
        public TextView tv_eye2;
        public TextView tv_price2;

        public AdHolder(View itemView) {
            super(itemView);
              iv_iamges=(ImageView) itemView.findViewById(R.id.iv_iamges);
              tv_title=(TextView)itemView.findViewById(R.id.tv_title);
              tv_sub=(TextView)itemView.findViewById(R.id.tv_sub);
              iv_xianche=(TextView)itemView.findViewById(R.id.iv_xianche);
              checkBox=(ImageView)itemView.findViewById(R.id.checkBox);
              tv_heart=(TextView)itemView.findViewById(R.id.tv_heart);
              iv_eye=(ImageView)itemView.findViewById(R.id.iv_eye);
              tv_eye=(TextView)itemView.findViewById(R.id.tv_eye);
              tv_price=(TextView)itemView.findViewById(R.id.tv_price);
            //
              iv_iamges2=(ImageView)itemView.findViewById(R.id.iv_iamges2);
              tv_title2=(TextView)itemView.findViewById(R.id.tv_title2);
              tv_sub2=(TextView)itemView.findViewById(R.id.tv_sub2);
              iv_xianche2=(TextView)itemView.findViewById(R.id.iv_xianche2);
              checkBox2=(ImageView)itemView.findViewById(R.id.checkBox2);
              tv_heart2=(TextView)itemView.findViewById(R.id.tv_heart2);
              iv_eye2=(ImageView)itemView.findViewById(R.id.iv_eye2);
              tv_eye2=(TextView)itemView.findViewById(R.id.tv_eye2);
              tv_price2=(TextView)itemView.findViewById(R.id.tv_price2);

        }

    }

    //广告卡片
    public static class AdBannerHolder extends ViewHolder {


        public AdBannerHolder(View itemView) {
            super(itemView);

        }

    }

    public static class ViewHolder {
        public View itemView;

        public ViewHolder(View itemView) {
            this.itemView = itemView;
        }
    }


    public static List<TogetherBean> create(List<CarBean> mCarBean) {
        List<TogetherBean> TogetherBeans=new ArrayList<>();
        while (mCarBean.size()>0){

            TogetherBean mTemp=new TogetherBean();
            mTemp.setCardType(CardBean.CAR_ITEM);
            List<CardBean> mCarBeans=new ArrayList<>();


            mCarBeans.add(mCarBean.get(0));
            mCarBean.remove(0);

            if(mCarBean.size()>0){
                mCarBeans.add(mCarBean.get(0));
                mCarBean.remove(0);
            }

            mTemp.setmCardBean(mCarBeans);

            TogetherBeans.add(mTemp);
        }

        return TogetherBeans;
    }
}
