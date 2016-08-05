package com.zx.car.mvp.handlers;

import com.zx.car.bean.CarBean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
public interface HotCarListem {
    void success(List<CarBean> homeBannerBeens);
    void error(String msg);
    void start();
}
