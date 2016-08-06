package com.zx.car.Page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.zx.car.R;

/**
 * Created by Administrator on 2016/7/30.
 */
public class CarPage extends BasePage{
    public CarPage(Context context) {
        super(context);
    }

    public CarPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CarPage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static CarPage getXml(Context mContext){
        return (CarPage) LayoutInflater.from(mContext).inflate(R.layout.page_car_layout,null);
    }

    @Override
    public void initPage() {

    }

    public void setOffsetY(int top) {

        if(getChildCount()>0){
            getChildAt(0).setPadding(0,top,0,0);
        }
    }
}
