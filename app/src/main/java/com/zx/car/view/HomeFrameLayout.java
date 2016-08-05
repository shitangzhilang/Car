package com.zx.car.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.zx.car.Page.BasePage;
import com.zx.car.R;
import com.zx.car.base.Contans;

/**
 * 主页
 * Created by ferris.xu on 2016/7/30.
 */
public class HomeFrameLayout extends FrameLayout {

    private  int currentPosition=-1;


    BasePage mHomePage,mCarPage,mServicePage,mPersonPage;

    public HomeFrameLayout(Context context) {
        super(context);
    }

    public HomeFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mHomePage= (BasePage) findViewById(R.id.mHomePage);
        mCarPage= (BasePage) findViewById(R.id.mCarPage);
        mServicePage= (BasePage) findViewById(R.id.mServicePage);
        mPersonPage= (BasePage) findViewById(R.id.mPersonPage);
    }

    /**
     * 显示view
     * @param position
     */
    public void show(int position) {
        hideAll();
        switch (position){
            case Contans.MENU_HOME_ITEM:
                mHomePage.setVisibility(View.VISIBLE);
                mHomePage.show();
                currentPosition=0;
                break;
            case Contans.MENU_CAR_ITEM:
                mCarPage.setVisibility(View.VISIBLE);
                mCarPage.show();
                currentPosition=1;
                break;
            case Contans.MENU_ADD_ITEM:
                break;
            case Contans.MENU_SERVICE_ITEM:
                mServicePage.setVisibility(View.VISIBLE);
                mServicePage.show();
                currentPosition=3;
                break;
            case Contans.MENU_PERSON_ITEM:
                mPersonPage.setVisibility(View.VISIBLE);
                mPersonPage.show();
                currentPosition=4;
                break;

        }


    }



    public void hideAll(){
        for(int i=0;i<getChildCount();i++){
            View v=getChildAt(i);
            if(v.getVisibility()!=View.GONE){
                v.setVisibility(View.GONE);
            }
        }
    }



}
