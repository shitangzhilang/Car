package com.zx.car;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex.chen on 2016/8/5 0005 18:32.
 */
public class DataEditActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_edit);

        init();
    }

    private void init() {
        findViewById(R.id.iv_data_edit_back).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_data_edit_back:
                finish();
                break;
        }
    }
}
