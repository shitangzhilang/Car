package com.zx.car.bean;

import java.util.List;

/**
 * Created by ferris on 2016/8/1.
 */
public class TogetherBean extends CardBean{
    List<CardBean> mCardBean;

    public List<CardBean> getmCardBean() {
        return mCardBean;
    }

    public void setmCardBean(List<CardBean> mCardBean) {
        this.mCardBean = mCardBean;
    }
}
