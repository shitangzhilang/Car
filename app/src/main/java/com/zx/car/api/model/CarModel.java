package com.zx.car.api.model;

import android.text.TextUtils;

import com.zx.car.api.API;
import com.zx.car.api.JsonTools;
import com.zx.car.api.base.DataModel;
import com.zx.car.bean.CarBean;
import com.zx.car.bean.HomeBannerBean;
import com.zx.car.http.OkHttpUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Response;

/**
 * Created by 获取首页汽车信息列表 on 2015/12/29.
 */
public class CarModel extends DataModel<List<CarBean>> {

    @Override
    public List<CarBean> getData(Object... obj) {
        try {
            int sort= (int) obj[0];
            int pageindex= (int) obj[1];
            int pagesize= (int) obj[2];
            Response response = OkHttpUtils
                    .post()
                    .url(API.GetCarsList)
                    .addParams("key",API.KEY)
                    .addParams("sort",String.valueOf(sort))
                    .addParams("pageindex",String.valueOf(pageindex))
                    .addParams("pagesize",String.valueOf(pagesize))
                    .build()
                    .connTimeOut(8000)
                    .readTimeOut(8000)
                    .writeTimeOut(8000)
                    .execute();
            String jsonString = response.body().string();
            if(!TextUtils.isEmpty(jsonString)){
                return JsonTools.getCarBean(jsonString);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }


}
