package com.zx.car.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;

import com.zx.car.adapter.HomeCarSourceAdapter;
import com.zx.car.bean.CarSourceBean;
import com.zx.car.bean.CarSourceCardBean;
import com.zx.car.mvp.handlers.CarSourceListem;
import com.zx.car.mvp.presenters.CarSourcePresenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alex.chen on 2016/8/3 0003 15:09.
 */
public class CarSourceListView extends BaseListView implements CarSourceListem{
    private CarSourcePresenter mCarSourcePresenter;

    public CarSourceListView(Context context) {
        super(context);
        init();
    }

    public CarSourceListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CarSourceListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mCarSourcePresenter = new CarSourcePresenter();
        mCarSourcePresenter.onResume(this);
        mCarSourcePresenter.requestData();
    }

    public void refreshData(){
        if(mCarSourcePresenter!=null){
            mCarSourcePresenter.requestData();
        }
    }

    private String lastFirstBrand_py,lastBrand_py;

    @Override
    public void success(List<CarSourceBean> homeBannerBeens) {
        Log.e("test","请求数据成功 "+homeBannerBeens.size());
        //用于存放处理后的数据的集合
        List<CarSourceCardBean> carSourceCardBeans = new ArrayList<>();
        //首先将集合按照 品牌简称 有小到大排序一遍
        Collections.sort(homeBannerBeens,new BrandNameCompaptor());
        //添加分类的拼音项
        for(int i=0; i<homeBannerBeens.size(); i++){
            CarSourceBean bean = homeBannerBeens.get(i);
            String brand_jpy = bean.getBrand_py();

            String firstPinYin = brand_jpy.substring(0,1).toUpperCase();
            //添加首字母分类
            if(!TextUtils.isEmpty(firstPinYin) && !firstPinYin.equals(lastFirstBrand_py)){
                CarSourceCardBean cardBean = new CarSourceCardBean();
                cardBean.setCardType(CarSourceCardBean.PINYIN_TYPE_ITEM);
                cardBean.setTitle(firstPinYin);

                carSourceCardBeans.add(cardBean);
            }
//
//            //如果拼音首字母相同，但拼音不同，添加分割线
            if(firstPinYin.equals(lastFirstBrand_py) && !brand_jpy.equals(lastBrand_py)){
                CarSourceCardBean cardBean = new CarSourceCardBean();
                cardBean.setCardType(CarSourceCardBean.LINE_ITEM);

                carSourceCardBeans.add(cardBean);
            }
//            //如果拼音不同，添加分类图标标题选项
            if(!brand_jpy.equals(lastBrand_py)){
                CarSourceCardBean cardBean = new CarSourceCardBean();
                cardBean.setCardType(CarSourceCardBean.CAR_BRAND_ITEM);
                cardBean.setTitle(bean.getBrand_title());
                cardBean.setIconUrl(bean.getBrand_ico());

                carSourceCardBeans.add(cardBean);
            }

            carSourceCardBeans.add(bean);
            lastFirstBrand_py = firstPinYin;
            lastBrand_py = brand_jpy;
//            Log.e("test",bean.brand_title+" "+bean.getCarmodel_title()+" "+bean.getBrand_py()+" "+bean.getBrand_jpy());
        }
        Log.e("test","总数："+carSourceCardBeans.size());
        for(int i=0; i<carSourceCardBeans.size(); i++){
            CarSourceCardBean bean = carSourceCardBeans.get(i);
            Log.e("test",bean.getCardType()+" "+bean.getTitle());
        }

        HomeCarSourceAdapter adapter = new HomeCarSourceAdapter(getContext(),carSourceCardBeans);
        setAdapter(adapter);
    }

    @Override
    public void error(String msg) {
        Log.e("test","请求数据失败");
    }

    @Override
    public void start() {
        Log.e("test","请求数据开始");
    }

    private class BrandNameCompaptor implements Comparator<CarSourceBean>{

        @Override
        public int compare(CarSourceBean lhs, CarSourceBean rhs) {
            return lhs.getBrand_jpy().compareTo(rhs.getBrand_jpy());
        }
    }
}
