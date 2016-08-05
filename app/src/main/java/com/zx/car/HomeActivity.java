package com.zx.car;

import android.os.Bundle;
import android.widget.Toast;

import com.zx.car.base.BaseActivity;
import com.zx.car.view.HomeFrameLayout;
import com.zx.car.view.HomeMenuLayout;
import com.zx.car.view.RootFrameLayout;

public class HomeActivity extends BaseActivity implements HomeMenuLayout.OnPageSelectorListem{
    RootFrameLayout mRootFrameLayout;
    HomeFrameLayout mHomeFrameLayout;
    HomeMenuLayout mHome_menu_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //findview
        mRootFrameLayout= (RootFrameLayout) findViewById(R.id.mRootFrameLayout);
        mHomeFrameLayout= (HomeFrameLayout) findViewById(R.id.mHomeFrameLayout);
        mHome_menu_layout= (HomeMenuLayout) findViewById(R.id.mHome_menu_layout);
        mHome_menu_layout.setOnPageSelectorListem(this);


        mHomeFrameLayout.show(0);
        mHome_menu_layout.first(0);
    }





    @Override
    public void onPageSelector(int position) {
        Toast.makeText(this,"position="+position,Toast.LENGTH_SHORT).show();
        if(mHomeFrameLayout!=null)
        mHomeFrameLayout.show(position);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mHome_menu_layout!=null){
            mHome_menu_layout.setOnPageSelectorListem(null);
            mHome_menu_layout=null;
        }
    }
}
