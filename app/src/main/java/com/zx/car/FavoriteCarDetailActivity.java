package com.zx.car;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex.chen on 2016/8/6 0006 16:26.
 */
public class FavoriteCarDetailActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_car_detail);

        init();
    }

    private void init() {
        findViewById(R.id.iv_back).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
