package com.zx.car.api.base;



/**
 * Created by Administrator on 2015/11/10.
 */
public abstract  class DataModel <T>{
    public   <T> T getData(Object ... obj){
        return null;
    }


    public  void getDataAsync(APICallBack<T> tCallback,Object... obj){

    }
    public void getDataAsync( Object... obj){

    }
}
