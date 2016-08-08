package com.zx.car.Page;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.zx.car.R;
import com.zx.car.ServiceDetailActivity;

/**
 * Created by ferris on 2016/7/30.
 */
public class ServicePage extends BasePage implements View.OnClickListener{
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

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.layout_service_quality).setOnClickListener(this);
        findViewById(R.id.layout_service_mortgages).setOnClickListener(this);
        findViewById(R.id.layout_service_pdi).setOnClickListener(this);
        findViewById(R.id.layout_service_card).setOnClickListener(this);
//        findViewById(R.id.layout_service_tip).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ServiceDetailActivity.class);
        switch (v.getId()){
            case R.id.layout_service_quality:
                intent.setAction("0");
                break;
            case R.id.layout_service_mortgages:
                intent.setAction("1");
                break;
            case R.id.layout_service_pdi:
                intent.setAction("2");
                break;
            case R.id.layout_service_card:
                intent.setAction("3");
                break;
//            case R.id.layout_service_tip:
//                intent.setAction("0");
//                break;
        }
        getContext().startActivity(intent);

    }
}
