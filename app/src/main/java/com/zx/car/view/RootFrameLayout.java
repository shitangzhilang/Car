package com.zx.car.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.zx.car.Page.CarPage;
import com.zx.car.R;
import com.zx.car.base.Insettable;

/**
 * Created by ferris.xu on 2016/7/30.
 */
public class RootFrameLayout extends FrameLayout implements  Insettable {

    public RootFrameLayout(Context context) {
        super(context);
    }

    public RootFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RootFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected boolean fitSystemWindows(Rect insets) {

        setInsets(insets);
        setSelfRect(insets);
        return true;
    }

    @Override
    public void setInsets(Rect insets) {
        View mView=findViewById(R.id.mContaint);
        if(mView!=null&&mView instanceof  PadingLinearLayout){
            ((PadingLinearLayout)mView).setOffsetY(insets.top);
        }

        View mView2=findViewById(R.id.mCarPage);
        if(mView2!=null&&mView2 instanceof CarPage){
            ((CarPage)mView2).setOffsetY(insets.top);
        }
    }

    public void setSelfRect(Rect insets){
        if(getLayoutParams()==null){
            return;
        }

        FrameLayout.LayoutParams lp= (LayoutParams) getLayoutParams();
        lp.bottomMargin=insets.bottom;
        setLayoutParams(lp);

    }

}
