package com.zx.car.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.zx.car.R;

/**
 * 菜单
 * Created by ferris.xu on 2016/7/30.
 */
public class HomeMenuLayout extends LinearLayout implements View.OnClickListener{

    HomeMenuItemLayout item_home,item_carsource,item_service,item_person;
    LinearLayout item_add;

    public HomeMenuLayout(Context context) {
        super(context);
    }

    public HomeMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeMenuLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        item_home= (HomeMenuItemLayout) findViewById(R.id.item_home);
        item_carsource= (HomeMenuItemLayout) findViewById(R.id.item_carsource);
        item_add= (LinearLayout) findViewById(R.id.item_add);
        item_service= (HomeMenuItemLayout) findViewById(R.id.item_service);
        item_person= (HomeMenuItemLayout) findViewById(R.id.item_person);

        for(int  i=0;i<getChildCount();i++){
            View v=getChildAt(i);
            v.setClickable(true);
            v.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.item_home:
                reseat();
                item_home.selector(true);
                selete(0);
                break;
            case R.id.item_carsource:
                reseat();
                item_carsource.selector(true);
                selete(1);
                break;
            case R.id.item_add:
                selete(2);
                break;
            case R.id.item_service:
                reseat();
                item_service.selector(true);
                selete(3);
                break;
            case R.id.item_person:
                reseat();
                item_person.selector(true);
                selete(4);
                break;
        }
    }

    public void first(int position){
        reseat();
        item_home.selector(true);
        selete(0);
    }
    public void selete(int positon){
        if(onPageSelectorListem!=null&&onPageSelectorListem instanceof OnPageSelectorListem){
            onPageSelectorListem.onPageSelector(positon);
        }
    }

    public void reseat(){
        item_home.selector(false);
        item_carsource.selector(false);
        item_service.selector(false);
        item_person.selector(false);
    }

    public interface OnPageSelectorListem{
        void onPageSelector(int position);
    }

    OnPageSelectorListem onPageSelectorListem;

    public OnPageSelectorListem getOnPageSelectorListem() {
        return onPageSelectorListem;
    }

    public void setOnPageSelectorListem(OnPageSelectorListem onPageSelectorListem) {
        this.onPageSelectorListem = onPageSelectorListem;
    }
}
