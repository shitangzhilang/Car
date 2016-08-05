package com.zx.car;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex.chen on 2016/8/5 0005 16:04.
 */
public class LoginActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        findViewById(R.id.iv_login_back).setOnClickListener(this);
        findViewById(R.id.tv_login_we_chat).setOnClickListener(this);
        findViewById(R.id.tv_login_count).setOnClickListener(this);
        findViewById(R.id.tv_login_register).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.iv_login_back:
                finish();
                break;
            case R.id.tv_login_we_chat:
                intent = new Intent(this, RegisterActivity.class);
                intent.setAction("WeChat");
                startActivity(intent);
                break;
            case R.id.tv_login_count:
                intent = new Intent(this, RegisterActivity.class);
                intent.setAction("ForgetCode");
                startActivity(intent);
                break;
            case R.id.tv_login_register:
                intent = new Intent(this, RegisterActivity.class);
                intent.setAction("Register");
                startActivity(intent);
                break;
        }
    }
}
