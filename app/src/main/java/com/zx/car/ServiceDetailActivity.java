package com.zx.car;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alex.chen on 2016/8/6 0006 11:30.
 */
public class ServiceDetailActivity extends Activity{
    private ImageView iv_service_dt_header;
    private TextView tv_service_dt_content;

    private int[] headers = {R.drawable.ser_quality, R.drawable.ser_mortgages, R.drawable.ser_pdi, R.drawable.ser_card};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        tv_service_dt_content = (TextView) findViewById(R.id.tv_service_dt_content);
        iv_service_dt_header = (ImageView) findViewById(R.id.iv_service_dt_header);

        String action = getIntent().getAction();
        initData(action);
    }

    private void initData(String action){
        int act = Integer.parseInt(action);
        iv_service_dt_header.setImageResource(headers[act]);
    }
}
