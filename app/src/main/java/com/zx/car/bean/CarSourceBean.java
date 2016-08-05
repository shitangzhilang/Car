package com.zx.car.bean;

/**
 * Created by 车源 on 2016/8/2.
 */
public class CarSourceBean extends CarSourceCardBean{
    public int carmodel_id ; //唯一标识
    public int carmedel_brandenum ;  //品牌唯一标识，对应 品牌数据字典
    public String carmodel_title ; // 车系名称
    public String addtime ;  // 添加时间
    public boolean isdel ;
    public String brand_title ; // 品牌名称
    public String brand_ico ; // 品牌图标
    public String brand_jpy ; // 品牌简称或英文
    public String brand_py ; // 拼音

    public String carmodel_ico ;// 车系图片

    public String carmodel_fmimgs ; //封面选择图 xxx|xxx

    public int getCarmodel_id() {
        return carmodel_id;
    }

    public void setCarmodel_id(int carmodel_id) {
        this.carmodel_id = carmodel_id;
    }

    public int getCarmedel_brandenum() {
        return carmedel_brandenum;
    }

    public void setCarmedel_brandenum(int carmedel_brandenum) {
        this.carmedel_brandenum = carmedel_brandenum;
    }

    public String getCarmodel_title() {
        return carmodel_title;
    }

    public void setCarmodel_title(String carmodel_title) {
        this.carmodel_title = carmodel_title;
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

    public String getBrand_title() {
        return brand_title;
    }

    public void setBrand_title(String brand_title) {
        this.brand_title = brand_title;
    }

    public String getBrand_ico() {
        return brand_ico;
    }

    public void setBrand_ico(String brand_ico) {
        this.brand_ico = brand_ico;
    }

    public void setBrand_jpy(String brand_jpy) {
        this.brand_jpy = brand_jpy;
    }

    public String getBrand_jpy() {
        return brand_jpy;
    }

    public String getBrand_py() {
        return brand_py;
    }

    public void setBrand_py(String brand_py) {
        this.brand_py = brand_py;
    }

    public String getCarmodel_ico() {
        return carmodel_ico;
    }

    public void setCarmodel_ico(String carmodel_ico) {
        this.carmodel_ico = carmodel_ico;
    }

    public String getCarmodel_fmimgs() {
        return carmodel_fmimgs;
    }

    public void setCarmodel_fmimgs(String carmodel_fmimgs) {
        this.carmodel_fmimgs = carmodel_fmimgs;
    }
}
