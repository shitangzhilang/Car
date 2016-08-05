package com.zx.car.api.base;


import okhttp3.Call;

/**
 * Created by Administrator on 2016/2/19.
 */
public   abstract class APICallBack<T>{
    public void onBefore()
    {
    }

    /**
     * UI Thread
     *
     * @param
     */
    public void onAfter()
    {

    }

    /**
     * UI Thread
     *
     * @param progress
     */
    public void inProgress(float progress)
    {

    }

    public abstract void onError(Call call, Exception e);

    public abstract void onResponse(T response);
}
