package com.zx.car.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;

import com.zx.car.R;

/**
 * 
 * Created by ferris.xu  on 2016/8/2.
 */
public class FixScrollView extends ScrollView {
    public FixScrollView(Context context) {
        super(context);
    }

    public FixScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    // 滑动距离及坐标
    private float xDistance, yDistance, xLast, yLast,xDown,yDown;


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xDistance = yDistance = 0f;
                xLast = ev.getX();
                yLast = ev.getY();

                xDown= ev.getX();
                yDown= ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                final float curX = ev.getX();
                final float curY = ev.getY();

                xDistance += Math.abs(curX - xLast);
                yDistance += Math.abs(curY - yLast);
                xLast = curX;
                yLast = curY;

                if(xDistance > yDistance||yDistance>xDistance&&isReadyForPullEnd()&&(curY-yDown)<0||yDistance>xDistance&&isReadyForPullStart()&&(curY-yDown)>0||isNeedIntercept(curY)){
                    return false;
                }

        }

        return super.onInterceptTouchEvent(ev);
    }

    //listview 往下滑动，并且不是在最顶部，scrollview不需要拦截
    public boolean isNeedIntercept(float curY){
        ViewPager mViewPage= (ViewPager) findViewById(R.id.mHomePageListView);
        ListView mListView= (ListView) mViewPage.getChildAt(mViewPage.getCurrentItem());
        return  (mListView.getFirstVisiblePosition() != 0)&&yDistance>xDistance&&(curY-yDown)>0;
    }



    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xDistance = yDistance = 0f;
                xLast = ev.getX();
                yLast = ev.getY();

                xDown= ev.getX();
                yDown= ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                final float curX = ev.getX();
                final float curY = ev.getY();

                xDistance += Math.abs(curX - xLast);
                yDistance += Math.abs(curY - yLast);
                xLast = curX;
                yLast = curY;

                if(xDistance > yDistance||yDistance>xDistance&&isReadyForPullEnd()&&(curY-yDown)<0||yDistance>xDistance&&isReadyForPullStart()&&(curY-yDown)>0||isNeedIntercept(curY)){
                    return false;
                }

        }

        return super.onTouchEvent(ev);
    }



    protected boolean isReadyForPullStart() {
        return getScrollY() == 0;
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    protected boolean isReadyForPullEnd() {
        View scrollViewChild = getChildAt(0);
        if (null != scrollViewChild) {
            return getScrollY() >= (scrollViewChild.getHeight() - getHeight());
        }
        return false;
    }

//    fullScroll

    @Override
    public boolean fullScroll(int direction) {
        return super.fullScroll(direction);
    }
}
