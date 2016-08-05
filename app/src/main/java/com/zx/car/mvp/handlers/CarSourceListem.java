package com.zx.car.mvp.handlers;

import com.zx.car.bean.CarSourceBean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
public interface CarSourceListem {
    void success(List<CarSourceBean> homeBannerBeens);
    void error(String msg);
    void start();
}
