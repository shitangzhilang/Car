package com.zx.car.bean;

/**
 * Created by 首页广告banner on 2016/7/31.
 */
public class HomeBannerBean extends CardBean {
    public int ad_id ;         //唯一标识
    public String ad_title ;   //标题
    public String ad_imgs ;    //图片
    public int ad_location_enum ;  //定位标识
    public int ad_type_enum ;    //广告类型
    public int ad_type_carid ;   //广告类型车源ID
    public int ad_type_traderid ; //广告类型经销商id
    public String ad_type_weburl ; //广告类型外链
    public int ad_type_brandenum ;  //广告类型品牌
    public int ad_type_carmodelid ; //广告类型车系
    public String addtime ;  //时间
    public boolean isdel ;  //是否删除

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_title() {
        return ad_title;
    }

    public void setAd_title(String ad_title) {
        this.ad_title = ad_title;
    }

    public String getAd_imgs() {
        return ad_imgs;
    }

    public void setAd_imgs(String ad_imgs) {
        this.ad_imgs = ad_imgs;
    }

    public int getAd_location_enum() {
        return ad_location_enum;
    }

    public void setAd_location_enum(int ad_location_enum) {
        this.ad_location_enum = ad_location_enum;
    }

    public int getAd_type_enum() {
        return ad_type_enum;
    }

    public void setAd_type_enum(int ad_type_enum) {
        this.ad_type_enum = ad_type_enum;
    }

    public int getAd_type_carid() {
        return ad_type_carid;
    }

    public void setAd_type_carid(int ad_type_carid) {
        this.ad_type_carid = ad_type_carid;
    }

    public int getAd_type_traderid() {
        return ad_type_traderid;
    }

    public void setAd_type_traderid(int ad_type_traderid) {
        this.ad_type_traderid = ad_type_traderid;
    }

    public String getAd_type_weburl() {
        return ad_type_weburl;
    }

    public void setAd_type_weburl(String ad_type_weburl) {
        this.ad_type_weburl = ad_type_weburl;
    }

    public int getAd_type_brandenum() {
        return ad_type_brandenum;
    }

    public void setAd_type_brandenum(int ad_type_brandenum) {
        this.ad_type_brandenum = ad_type_brandenum;
    }

    public int getAd_type_carmodelid() {
        return ad_type_carmodelid;
    }

    public void setAd_type_carmodelid(int ad_type_carmodelid) {
        this.ad_type_carmodelid = ad_type_carmodelid;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public boolean isdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }
}
