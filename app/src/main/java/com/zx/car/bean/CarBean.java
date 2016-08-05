package com.zx.car.bean;

/**
 * 汽车
 * Created by ferris.xu on 2016/8/1.
 */
public class CarBean extends CardBean{
    public int car_id ; // 汽车唯一标识
    public String car_all_title ; // 汽车全标题
    public int car_att ; // 订阅数统计
    public int car_brandenum ; //品牌标识
    public int car_specenum ;  //规格标识
    public int car_carmodelid ; //车系标识
    public int car_priceid ; // 价格区间
    public int car_traderid ; // 经销商标识
    public String car_title ; // 车详细名称
    public double car_price ; // 价格
    public String car_color ; // 车身颜色
    public String car_interiorcolor ; // 内饰颜色
    public double car_marketprice ; // 市场价格
    public int car_province ; //省Id
    public int car_city ; //城市Id
    public int car_area ; //区域Id
    public String car_sale_address ; // 手输具体地址
    public boolean car_isstock ; //是否现车
    public String car_falsestock_date ; //期车到达时间
    public String car_frameno ; //车架号
    public String car_imgs ; //车辆照片
    public String car_procedures ; //手续
    public String car_configure ; //配置
    public String car_remarks ; //备注
    public boolean issale ; //是否特价车
    public double truesale_price ; //降价金额
    public boolean ishot ; // 是否热门车|1热门，0普通
    public boolean issalestate ; //销售状态| 1：销售中，0停止
    public boolean isdel ; //删除
    public String addtime ; //添加时间
    public String spece_title ; // 规格名称
    public String spece_ico ; // 规格图标
    public int brand_id ; //品牌标识
    public String carmodel_title ; // 车系名称
    public String brand_title ; // 品牌名称
    public String brand_ico ;  // 品牌图标
    public String trader_title ; // 经销商名称
    public String trader_company ; //经销商公司
    public String trader_logo ; // 经销商logo
    public String trader_tel ; // 经销商电话
    public String trader_mobile ; // 经销商手机
    public int car_cartypenum ; // 车类型标识
    public String cartype_title ; //车类型名称
    public int car_click ; // 点击量

    public String car_province_title ; // 车源所在省
    public String car_city_title ; // 车源所在城市
    public int trader_province ; // 经销商所在省
    public int trader_city ;  // 经销商所在城市
    public String trader_company_address ; // 经销商公司所在地址

    public String carmodel_ico ; //车型图标
    public String car_coverimgs ; //封面图标

    public int car_trueclick;
    public boolean isaudit;

    public boolean isaudit() {
        return isaudit;
    }

    public void setIsaudit(boolean isaudit) {
        this.isaudit = isaudit;
    }

    public int getCar_trueclick() {
        return car_trueclick;
    }

    public void setCar_trueclick(int car_trueclick) {
        this.car_trueclick = car_trueclick;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_all_title() {
        return car_all_title;
    }

    public void setCar_all_title(String car_all_title) {
        this.car_all_title = car_all_title;
    }

    public int getCar_att() {
        return car_att;
    }

    public void setCar_att(int car_att) {
        this.car_att = car_att;
    }

    public int getCar_brandenum() {
        return car_brandenum;
    }

    public void setCar_brandenum(int car_brandenum) {
        this.car_brandenum = car_brandenum;
    }

    public int getCar_specenum() {
        return car_specenum;
    }

    public void setCar_specenum(int car_specenum) {
        this.car_specenum = car_specenum;
    }

    public int getCar_carmodelid() {
        return car_carmodelid;
    }

    public void setCar_carmodelid(int car_carmodelid) {
        this.car_carmodelid = car_carmodelid;
    }

    public int getCar_priceid() {
        return car_priceid;
    }

    public void setCar_priceid(int car_priceid) {
        this.car_priceid = car_priceid;
    }

    public int getCar_traderid() {
        return car_traderid;
    }

    public void setCar_traderid(int car_traderid) {
        this.car_traderid = car_traderid;
    }

    public String getCar_title() {
        return car_title;
    }

    public void setCar_title(String car_title) {
        this.car_title = car_title;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public String getCar_interiorcolor() {
        return car_interiorcolor;
    }

    public void setCar_interiorcolor(String car_interiorcolor) {
        this.car_interiorcolor = car_interiorcolor;
    }

    public double getCar_marketprice() {
        return car_marketprice;
    }

    public void setCar_marketprice(double car_marketprice) {
        this.car_marketprice = car_marketprice;
    }

    public int getCar_province() {
        return car_province;
    }

    public void setCar_province(int car_province) {
        this.car_province = car_province;
    }

    public int getCar_city() {
        return car_city;
    }

    public void setCar_city(int car_city) {
        this.car_city = car_city;
    }

    public int getCar_area() {
        return car_area;
    }

    public void setCar_area(int car_area) {
        this.car_area = car_area;
    }

    public String getCar_sale_address() {
        return car_sale_address;
    }

    public void setCar_sale_address(String car_sale_address) {
        this.car_sale_address = car_sale_address;
    }

    public boolean isCar_isstock() {
        return car_isstock;
    }

    public void setCar_isstock(boolean car_isstock) {
        this.car_isstock = car_isstock;
    }

    public String getCar_falsestock_date() {
        return car_falsestock_date;
    }

    public void setCar_falsestock_date(String car_falsestock_date) {
        this.car_falsestock_date = car_falsestock_date;
    }

    public String getCar_frameno() {
        return car_frameno;
    }

    public void setCar_frameno(String car_frameno) {
        this.car_frameno = car_frameno;
    }

    public String getCar_imgs() {
        return car_imgs;
    }

    public void setCar_imgs(String car_imgs) {
        this.car_imgs = car_imgs;
    }

    public String getCar_procedures() {
        return car_procedures;
    }

    public void setCar_procedures(String car_procedures) {
        this.car_procedures = car_procedures;
    }

    public String getCar_configure() {
        return car_configure;
    }

    public void setCar_configure(String car_configure) {
        this.car_configure = car_configure;
    }

    public String getCar_remarks() {
        return car_remarks;
    }

    public void setCar_remarks(String car_remarks) {
        this.car_remarks = car_remarks;
    }

    public boolean issale() {
        return issale;
    }

    public void setIssale(boolean issale) {
        this.issale = issale;
    }

    public double getTruesale_price() {
        return truesale_price;
    }

    public void setTruesale_price(double truesale_price) {
        this.truesale_price = truesale_price;
    }

    public boolean ishot() {
        return ishot;
    }

    public void setIshot(boolean ishot) {
        this.ishot = ishot;
    }

    public boolean issalestate() {
        return issalestate;
    }

    public void setIssalestate(boolean issalestate) {
        this.issalestate = issalestate;
    }

    public boolean isdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getSpece_title() {
        return spece_title;
    }

    public void setSpece_title(String spece_title) {
        this.spece_title = spece_title;
    }

    public String getSpece_ico() {
        return spece_ico;
    }

    public void setSpece_ico(String spece_ico) {
        this.spece_ico = spece_ico;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getCarmodel_title() {
        return carmodel_title;
    }

    public void setCarmodel_title(String carmodel_title) {
        this.carmodel_title = carmodel_title;
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

    public String getTrader_title() {
        return trader_title;
    }

    public void setTrader_title(String trader_title) {
        this.trader_title = trader_title;
    }

    public String getTrader_company() {
        return trader_company;
    }

    public void setTrader_company(String trader_company) {
        this.trader_company = trader_company;
    }

    public String getTrader_logo() {
        return trader_logo;
    }

    public void setTrader_logo(String trader_logo) {
        this.trader_logo = trader_logo;
    }

    public String getTrader_tel() {
        return trader_tel;
    }

    public void setTrader_tel(String trader_tel) {
        this.trader_tel = trader_tel;
    }

    public String getTrader_mobile() {
        return trader_mobile;
    }

    public void setTrader_mobile(String trader_mobile) {
        this.trader_mobile = trader_mobile;
    }

    public int getCar_cartypenum() {
        return car_cartypenum;
    }

    public void setCar_cartypenum(int car_cartypenum) {
        this.car_cartypenum = car_cartypenum;
    }

    public String getCartype_title() {
        return cartype_title;
    }

    public void setCartype_title(String cartype_title) {
        this.cartype_title = cartype_title;
    }

    public int getCar_click() {
        return car_click;
    }

    public void setCar_click(int car_click) {
        this.car_click = car_click;
    }

    public String getCar_province_title() {
        return car_province_title;
    }

    public void setCar_province_title(String car_province_title) {
        this.car_province_title = car_province_title;
    }

    public String getCar_city_title() {
        return car_city_title;
    }

    public void setCar_city_title(String car_city_title) {
        this.car_city_title = car_city_title;
    }

    public int getTrader_province() {
        return trader_province;
    }

    public void setTrader_province(int trader_province) {
        this.trader_province = trader_province;
    }

    public int getTrader_city() {
        return trader_city;
    }

    public void setTrader_city(int trader_city) {
        this.trader_city = trader_city;
    }

    public String getTrader_company_address() {
        return trader_company_address;
    }

    public void setTrader_company_address(String trader_company_address) {
        this.trader_company_address = trader_company_address;
    }

    public String getCarmodel_ico() {
        return carmodel_ico;
    }

    public void setCarmodel_ico(String carmodel_ico) {
        this.carmodel_ico = carmodel_ico;
    }

    public String getCar_coverimgs() {
        return car_coverimgs;
    }

    public void setCar_coverimgs(String car_coverimgs) {
        this.car_coverimgs = car_coverimgs;
    }
}
