package com.zx.car.Page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.zx.car.R;

/**
 * Created by ferris on 2016/7/30.
 */
public class ServicePage extends BasePage {
    public ServicePage(Context context) {
        super(context);
    }

    public ServicePage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ServicePage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public static ServicePage getXml(Context mContext){
        return (ServicePage) LayoutInflater.from(mContext).inflate(R.layout.page_service_layout,null);
    }
    @Override
    public void initPage() {

    }
}
