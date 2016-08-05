package com.zx.car.mvp.handlers;

import com.zx.car.bean.HomeBannerBean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
public interface HomeBannerListem {
    void success(List<HomeBannerBean> homeBannerBeens);
    void error(String msg);
    void start();
}
