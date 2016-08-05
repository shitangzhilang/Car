package com.zx.car.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.Toast;

import com.zx.car.adapter.HomeHotNewAdapter;
import com.zx.car.bean.CarBean;
import com.zx.car.bean.TogetherBean;
import com.zx.car.mvp.handlers.HotCarListem;
import com.zx.car.mvp.presenters.HotCarPresenter;

import java.util.List;

/**
 * Created by 热门 on 2016/8/1.
 */
public class HotListView extends BaseListView implements HotCarListem{

    HotCarPresenter mHotCarPresenter;
    HomeHotNewAdapter mAapter;
    private int sore=1;
    private int pageindex=1;
    private int pagesize=20;
    boolean flag;
    public HotListView(Context context) {
        super(context);
        init();
    }

    public HotListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HotListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    public void init(){
        mHotCarPresenter=new HotCarPresenter();

        mHotCarPresenter.onResume(this);
        setOnScrollListener(new OnScrollListener() {
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                switch (scrollState) {
                    // 当不滚动时
                    case OnScrollListener.SCROLL_STATE_IDLE:
                        // 判断滚动到底部
                        if (getLastVisiblePosition() == (getCount() - 1)) {
//                            Toast.makeText(getContext(),"滚动到底部",Toast.LENGTH_SHORT).show();
                            refreshData();
                        }
                        // 判断滚动到顶部

                        if(getFirstVisiblePosition() == 0){
                        }

                        break;
                }
            }

            @Override
            public void onScroll(AbsListView absListView, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                if (firstVisibleItem + visibleItemCount == totalItemCount && !flag) {
                    flag = true;
                } else
                    flag = false;
            }
        });
        mAapter=new HomeHotNewAdapter(getContext());
        setAdapter(mAapter);
        refreshData();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    public void refreshData(){
        if(mHotCarPresenter!=null){
            mHotCarPresenter.requestData(sore,pageindex,pagesize);
        }
    }
    @Override
    public void success(List<CarBean> homeBannerBeens) {
        List<TogetherBean> mTogetherBean=HomeHotNewAdapter.create(homeBannerBeens);
        mAapter.update(mTogetherBean);
        pageindex+=1;
    }

    @Override
    public void error(String msg) {
        Toast.makeText(getContext(),"获取数据失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void start() {
        Toast.makeText(getContext(),"开始请求",Toast.LENGTH_SHORT).show();
    }
}
