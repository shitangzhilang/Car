package com.zx.car.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/8/1.
 */
public class FixViewPager extends ViewPager {
    private GestureDetector mGestureDetector = null;
    public FixViewPager(Context context) {
        super(context);
        init();
    }

    public FixViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init(){
        mGestureDetector = new GestureDetector(getContext(),new MyGestureDetector());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        if(mGestureDetector.onTouchEvent(ev)){
//            ViewGroup mParent=  ((ViewGroup)getParent().getParent().getParent());
//            mParent .requestDisallowInterceptTouchEvent(true);
//        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {


        return super.onTouchEvent(ev);
    }

    public class MyGestureDetector implements GestureDetector.OnGestureListener {

        @Override
        public boolean onDown(MotionEvent e) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {
            // TODO Auto-generated method stub

        }


        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            // TODO Auto-generated method stub

            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                float distanceX, float distanceY) {
            // TODO Auto-generated method stub
            return Math.abs(distanceX) > Math.abs(distanceY);
        }

        @Override
        public void onLongPress(MotionEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                               float velocityY) {
            // TODO Auto-generated method stub
            return false;
        }

    }
}
