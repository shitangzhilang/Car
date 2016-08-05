package com.zx.car.Page;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.zx.car.R;
import com.zx.car.UnRegisterActivity;

/**
 * Created by Administrator on 2016/7/30.
 */
public class PersonPage extends BasePage implements View.OnClickListener{
    private ImageView iv_user_pic;

    public PersonPage(Context context) {
        super(context);
    }

    public PersonPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PersonPage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public static PersonPage getXml(Context mContext){
        return (PersonPage) LayoutInflater.from(mContext).inflate(R.layout.page_person_layout,null);
    }
    @Override
    public void initPage() {

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        iv_user_pic = (ImageView) this.findViewById(R.id.iv_user_pic);
        iv_user_pic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_user_pic:
                getContext().startActivity(new Intent(getContext(), UnRegisterActivity.class));

                break;
        }
    }
}
