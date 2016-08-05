package com.zx.car;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Alex.chen on 2016/8/5 0005 11:10.
 */
public class RegisterActivity extends Activity implements View.OnClickListener{
    private TextView tv_register_user_agreement, tv_register_title, tv_register_we_chat, tv_register_count,tv_register_code, tv_register_tel;
    private LinearLayout layout_register_tel, layout_register_count, layout_register_agreement, layout_register_others;
    private Button btn_register_next;
    private ImageView iv_register_back;
    private EditText et_register_code;

    private String action = "Register";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
        action = getIntent().getAction();
        exchange();//根据action切换不同的页面
    }

    private void init(){
        tv_register_user_agreement = (TextView) findViewById(R.id.tv_register_user_agreement);
        tv_register_title = (TextView) findViewById(R.id.tv_register_title);
        tv_register_count = (TextView) findViewById(R.id.tv_register_count);
        tv_register_we_chat = (TextView) findViewById(R.id.tv_register_we_chat);
        tv_register_code = (TextView) findViewById(R.id.tv_register_code);
        tv_register_tel = (TextView) findViewById(R.id.tv_register_tel);
        tv_register_user_agreement.setText(Html.fromHtml("<u>&lt;中信直通车用户协议></u>"));
        et_register_code = (EditText) findViewById(R.id.et_register_code);

        layout_register_tel = (LinearLayout) findViewById(R.id.layout_register_tel);
        layout_register_count = (LinearLayout) findViewById(R.id.layout_register_count);
        layout_register_agreement = (LinearLayout) findViewById(R.id.layout_register_agreement);
        layout_register_others = (LinearLayout) findViewById(R.id.layout_register_others);
        btn_register_next = (Button) findViewById(R.id.btn_register_next);
        btn_register_next.setOnClickListener(this);
        iv_register_back = (ImageView) findViewById(R.id.iv_register_back);
        iv_register_back.setOnClickListener(this);
        tv_register_we_chat.setOnClickListener(this);
        tv_register_count.setOnClickListener(this);
    }

    private void exchange(){
        switch (action) {
            case "Register"://注册
                tv_register_title.setText("个人注册");
                tv_register_tel.setText("登录账号：");
                tv_register_code.setText("设置密码：");
                break;
            case "WeChat"://微信登录
                tv_register_title.setText("绑定手机号");
                tv_register_tel.setText("账号：");
                tv_register_code.setText("密码：");
                break;
            case "ForgetCode"://忘记密码
                tv_register_title.setText("忘记密码");
                tv_register_tel.setText("手机账号：");
                tv_register_code.setText("重置密码：");
                et_register_code.setHint("请输入新密码");
                layout_register_agreement.setVisibility(View.INVISIBLE);
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register_next:
                if(layout_register_tel.getVisibility() == View.VISIBLE) {
                    layout_register_tel.setVisibility(View.GONE);
                    layout_register_count.setVisibility(View.VISIBLE);
                    layout_register_agreement.setVisibility(View.INVISIBLE);
                    if ("Register".equals(action)){
                        btn_register_next.setText("完成注册");
                    } else if("WeChat".equals(action)){
                        btn_register_next.setText("完成绑定");
                    } else if("ForgetCode".equals(action)){
                        btn_register_next.setText("重置");
                    }
                } else {
                    startActivity(new Intent(this, HomeActivity.class));
                }
                break;
            case R.id.iv_register_back:
                finish();
                break;
            case R.id.tv_register_count:

                break;
            case R.id.tv_register_we_chat:

                break;
        }
    }
}
