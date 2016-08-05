package com.zx.car.api.model;

import android.text.TextUtils;

import com.zx.car.api.API;
import com.zx.car.api.JsonTools;
import com.zx.car.api.base.DataModel;
import com.zx.car.bean.CarBean;
import com.zx.car.bean.CarSourceBean;
import com.zx.car.http.OkHttpUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Response;

/**
 * Created by 获取车源 on 2015/12/29.
 */
public class CarSourceModel extends DataModel<List<CarSourceBean>> {

    @Override
    public List<CarSourceBean> getData(Object... obj) {
        try {
            Response response = OkHttpUtils
                    .get()
                    .url(API.GetCarmodel)
                    .build()
                    .connTimeOut(8000)
                    .readTimeOut(8000)
                    .writeTimeOut(8000)
                    .execute();
            String jsonString = response.body().string();
            if(!TextUtils.isEmpty(jsonString)){
                return JsonTools.getCarSrouceBean(jsonString);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }


}
