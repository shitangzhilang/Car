package com.zx.car.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.zx.car.adapter.HomeViewPageAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页的listview
 * Created by ferris.xu on 2016/7/30.
 */
public class HomeViewPage extends ViewPager{
    HomeViewPageAdapter mHomeHotNewAdapter;
    private GestureDetector mGestureDetector = null;
    public HomeViewPage(Context context) {
        super(context);
        init();
    }

    public HomeViewPage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init(){
        mGestureDetector = new GestureDetector(getContext(),new MyGestureDetector());
        setOffscreenPageLimit(2);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mHomeHotNewAdapter=new HomeViewPageAdapter(getContext());
        List<View> mViews=new ArrayList<>();
        HotListView mHotListView=new HotListView(getContext());
        mViews.add(mHotListView);
        NewListView mNewListView=new NewListView(getContext());
        mViews.add(mNewListView);
        setAdapter(mHomeHotNewAdapter);
        mHomeHotNewAdapter.refresh(mViews);

    }



    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        if(mGestureDetector.onTouchEvent(ev)){
//            ViewGroup mParent=  ((ViewGroup)getParent().getParent().getParent());
//            mParent .requestDisallowInterceptTouchEvent(true);
//        }


        (getParent().getParent().getParent()).requestDisallowInterceptTouchEvent(true);


        int action = ev.getActionMasked();

        switch (action) {
            case MotionEvent.ACTION_UP:
                (getParent().getParent().getParent()).requestDisallowInterceptTouchEvent(false);
                break;
        }

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
