package com.zx.car.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/8/1.
 */
public class BaseListView extends ListView {
    private GestureDetector mGestureDetector = null;
    public BaseListView(Context context) {
        super(context);
        init2();
    }

    public BaseListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init2();
    }

    public BaseListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init2();
    }

    public void init2(){
        mGestureDetector = new GestureDetector(getContext(),new MyGestureDetector());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

//        (getParent().getParent().getParent()).requestDisallowInterceptTouchEvent(true);
//
//
//        int action = ev.getActionMasked();
//
//        switch (action) {
//            case MotionEvent.ACTION_UP:
//                (getParent().getParent().getParent()).requestDisallowInterceptTouchEvent(false);
//                break;
//        }

        return super.onInterceptTouchEvent(ev);
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
            return Math.abs(distanceX) < Math.abs(distanceY);
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
