package com.zx.car;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex.chen on 2016/8/4 0004 18:47.
 */
public class UnRegisterActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unregister);
    }

    public void select(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btn_unRegister_login:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_unRegister_weiXin:
                intent = new Intent(this, RegisterActivity.class);
                intent.setAction("WeChat");
                startActivity(intent);
                break;
            case R.id.btn_unRegister_register:
                intent = new Intent(this, RegisterActivity.class);
                intent.setAction("Register");
                startActivity(intent);
                break;
        }
    }
}
