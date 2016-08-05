package com.zx.car.api;

/**
 * Created by 数据接口 on 2015/11/30.
 */
public class API {
    public final static String URL="http://101.201.113.189";
    public final static String KEY="YXBpa2V5bGlsaTEyMyFAIyRmZGY1ODkrLTVoaGhoaGgxMmoyODhuYnZmZGRycg==";
    public final static String GetAdLocation=URL+"/api/GetAdBand?key="+KEY+"&ad_location_id=18";
    //插入在汽车列表里的
    public final static String GetAdLocationInCarsBanner=URL+"/api/GetAdBand?key="+KEY+"&ad_location_id=19";
    public final static String GetCarsList=URL+"/api/GetCarsList";
    public final static String GetCarmodel=URL+"/api/GetCarmodel?key="+KEY;


}
