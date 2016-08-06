package com.zx.car;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex.chen on 2016/8/5 0005 17:42.
 */
public class SettingActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        init();
    }

    private void init() {
        findViewById(R.id.iv_setting_back).setOnClickListener(this);
        findViewById(R.id.tv_setting_agreement).setOnClickListener(this);
        findViewById(R.id.tv_setting_grade).setOnClickListener(this);
        findViewById(R.id.tv_setting_contact).setOnClickListener(this);
        findViewById(R.id.tv_setting_feedback).setOnClickListener(this);
        findViewById(R.id.btn_setting_exit_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_setting_back://返回
                finish();
                break;
            case R.id.tv_setting_agreement://用户协议
                break;
            case R.id.tv_setting_grade://评分
                break;
            case R.id.tv_setting_contact://联系我们
                break;
            case R.id.tv_setting_feedback://意见反馈
                break;
            case R.id.btn_setting_exit_login://退出当前登录
                break;

        }
    }
}
