package com.zx.car.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zx.car.R;
import com.zx.car.bean.CarSourceBean;
import com.zx.car.bean.CarSourceCardBean;

import java.util.List;

/**
 * Created by Alex.chen on 2016/8/3 0003 15:14.
 */
public class HomeCarSourceAdapter extends BaseAdapter{

//    List<CarSourceBean> mCarSourceBeans;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<CarSourceCardBean> carSourceCardBeans;
    public HomeCarSourceAdapter(Context mContext,List<CarSourceCardBean> carSourceCardBeans) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
        this.carSourceCardBeans = carSourceCardBeans;
    }

    @Override
    public int getCount() {
        return carSourceCardBeans ==null?0: carSourceCardBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return carSourceCardBeans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return carSourceCardBeans.get(position).getCardType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = null;
        int type = getItemViewType(position);
//        if (convertView == null) {
            mViewHolder = onCreateViewHolder(convertView, parent, type);
//        } else {
//            mViewHolder = (ViewHolder) convertView.getTag();
//        }
        onBindViewHolder(mViewHolder, type,position);
        return mViewHolder.itemView;
    }

    public ViewHolder onCreateViewHolder(View convertView, ViewGroup parent, int i) {

        ViewHolder holder = null;
        switch (i) {

            case CarSourceCardBean.CONTENT_ITEM://车子内容项
                convertView = mLayoutInflater.inflate(R.layout.item_car_source_content, parent, false);
                holder = new CarContentViewHolder(convertView);
                convertView.setTag(holder);
                break;
            case CarSourceCardBean.PINYIN_TYPE_ITEM://拼音首字母项
                convertView = mLayoutInflater.inflate(R.layout.item_car_source_pinyin, parent, false);
                holder = new PinYinViewHolder(convertView);
                convertView.setTag(holder);
                break;
            case CarSourceCardBean.CAR_BRAND_ITEM://车品牌子item
                convertView = mLayoutInflater.inflate(R.layout.item_car_source_car_brand, parent, false);
                holder = new BrandViewHolder(convertView);
                convertView.setTag(holder);
                break;
            case CarSourceCardBean.LINE_ITEM://分割线
                convertView = mLayoutInflater.inflate(R.layout.item_car_source_line, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
                break;
        }

        return holder;

    }


    public void onBindViewHolder(ViewHolder viewHolder, int type,int position) {
        switch (type) {
            case CarSourceCardBean.CONTENT_ITEM:
                CarContentViewHolder mCarContentViewHolder = (CarContentViewHolder) viewHolder;
                CarSourceBean mCarSourceBean = (CarSourceBean) carSourceCardBeans.get(position);
                mCarContentViewHolder.tv_car_source_content_title.setText(mCarSourceBean.getCarmodel_title());

                Glide.with(mContext)
                        .load(mCarSourceBean.getCarmodel_ico())
                        .into(mCarContentViewHolder.iv_car_source_content_icon);
                break;
            case CarSourceCardBean.PINYIN_TYPE_ITEM:
//                if(viewHolder instanceof PinYinViewHolder) {
                    PinYinViewHolder mPinYinViewHolder = (PinYinViewHolder) viewHolder;
                    mPinYinViewHolder.tv_car_source_pinyin.setText(carSourceCardBeans.get(position).getTitle());
//                }
                break;

            case CarSourceCardBean.CAR_BRAND_ITEM:
//                if(viewHolder instanceof BrandViewHolder) {
                    BrandViewHolder mBrandViewHolder = (BrandViewHolder) viewHolder;
                    mBrandViewHolder.tv_car_source_brand_name.setText(carSourceCardBeans.get(position).getTitle());
                Glide.with(mContext)
                        .load(carSourceCardBeans.get(position).getIconUrl())
                        .into(mBrandViewHolder.iv_car_source_brand_icon);
//                }
                break;
            case CarSourceCardBean.LINE_ITEM:
                break;
        }
    }

    public class ViewHolder {
        public View itemView;

        public ViewHolder(View itemView) {
            this.itemView = itemView;
        }
    }

    private class CarContentViewHolder extends ViewHolder{
        public TextView tv_car_source_content_title;
        public ImageView iv_car_source_content_icon;
        public CarContentViewHolder(View itemView) {
            super(itemView);
            tv_car_source_content_title = (TextView) itemView.findViewById(R.id.tv_car_source_content_title);
            iv_car_source_content_icon = (ImageView) itemView.findViewById(R.id.iv_car_source_content_icon);
        }
    }
    private class PinYinViewHolder extends ViewHolder{
        public TextView tv_car_source_pinyin;

        public PinYinViewHolder(View itemView) {
            super(itemView);
            tv_car_source_pinyin = (TextView) itemView.findViewById(R.id.tv_car_source_pinyin);
        }
    }
    private class BrandViewHolder extends ViewHolder{
        public TextView tv_car_source_brand_name;
        public ImageView iv_car_source_brand_icon;

        public BrandViewHolder(View itemView) {
            super(itemView);
            tv_car_source_brand_name = (TextView) itemView.findViewById(R.id.tv_car_source_brand_name);
            iv_car_source_brand_icon = (ImageView) itemView.findViewById(R.id.iv_car_source_brand_icon);
        }
    }


}
