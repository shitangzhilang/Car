package com.zx.car.api;

import com.zx.car.bean.CarBean;
import com.zx.car.bean.CarSourceBean;
import com.zx.car.bean.HomeBannerBean;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonTools {

    /**
     * 检查更新
     *
     * @param jsonString
     * @return
     */
    public static String checkUpdate(String jsonString) {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);

            String error = jsonObject.get("error").toString();
            if ("0".equals(error)) {
                String data = jsonObject.get("data").toString();
                JSONObject checkUpdateUrl = new JSONObject(data);
                String url = checkUpdateUrl.has("url") ? checkUpdateUrl
                        .getString("url") : null;
                return url;
            }
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
        return null;
    }
//
//    /**
//     * 检查更新
//     *
//     * @param jsonString
//     * @return
//     */
//    public static UpdateInfo updateURL(String jsonString) {
//        try {
//            JSONObject jsonObject = new JSONObject(jsonString);
//
//            String error = jsonObject.get("error").toString();
//            if ("0".equals(error)) {
//                UpdateInfo mUpdateDownload=new UpdateInfo();
//                String data = jsonObject.get("data").toString();
//                JSONObject checkUpdateUrl = new JSONObject(data);
//                int id= checkUpdateUrl.has("id") ? checkUpdateUrl
//                        .getInt("id") : -1;
//                int appid= checkUpdateUrl.has("appid") ? checkUpdateUrl
//                        .getInt("appid") : -1;
//                String app_name= checkUpdateUrl.has("app_name") ? checkUpdateUrl
//                        .getString("app_name") : "";
//                String package_name= checkUpdateUrl.has("package_name") ? checkUpdateUrl
//                        .getString("package_name") : "";
//                String version_name= checkUpdateUrl.has("version_name") ? checkUpdateUrl
//                        .getString("version_name") : "";
//                int version=checkUpdateUrl.has("version") ? checkUpdateUrl
//                        .getInt("version") : -1;
//                String phone_model= checkUpdateUrl.has("phone_model") ? checkUpdateUrl
//                        .getString("phone_model") : "";
//                String apk_url= checkUpdateUrl.has("apk_url") ? checkUpdateUrl
//                        .getString("apk_url") : "";
//                String update_log= checkUpdateUrl.has("update_log") ? checkUpdateUrl
//                        .getString("update_log") : "";
//                String update_writer= checkUpdateUrl.has("update_writer") ? checkUpdateUrl
//                        .getString("update_writer") : "";
//                String md5= checkUpdateUrl.has("md5") ? checkUpdateUrl
//                        .getString("md5") : "";
//
//                String apk_name= checkUpdateUrl.has("apk_name") ? checkUpdateUrl
//                        .getString("apk_name") : "";
//                long target_size= checkUpdateUrl.has("target_size") ? checkUpdateUrl
//                        .getLong("target_size") : -1;
//                mUpdateDownload.setId(id);
//                mUpdateDownload.setAppid(appid);
//                mUpdateDownload.setApp_name(app_name);
//                mUpdateDownload.setPackage_name(package_name);
//                mUpdateDownload.setVersion_name(version_name);
//                mUpdateDownload.setVersion(version);
//                mUpdateDownload.setPhone_model(phone_model);
//                mUpdateDownload.setApk_url(apk_url);
//                mUpdateDownload.setUpdate_log(update_log);
//                mUpdateDownload.setUpdate_writer(update_writer);
//                mUpdateDownload.setMd5(md5);
//                mUpdateDownload.setTarget_size(target_size);
//                mUpdateDownload.setApk_name(apk_name);
//                return mUpdateDownload;
//            }
//        } catch (Exception e) {
//            // TODO: handle exception
//            return null;
//        }
//        return null;
//    }




    public static Boolean isUpdateSuccess(String jsonstring) {
        try {
            JSONObject jsonObject = new JSONObject(jsonstring);
            String error = jsonObject.has("error") ? jsonObject.get("error").toString() : "";
            if ("0".equals(error)) {
                return true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return false;
    }


    public static List<HomeBannerBean> getHomeBannerBean(String jsonstring){

        try {
            JSONObject jsonObject = new JSONObject(jsonstring);
            boolean error = jsonObject.has("success") ? jsonObject.getBoolean("success") : false;
            if (error) {
                JSONArray jsonArray=jsonObject.getJSONArray("json");
                if(jsonArray!=null&&jsonArray.length()>0){
                    List<HomeBannerBean> mHomeBannerBean=new ArrayList<>();
                    for(int i=0;i<jsonArray.length();i++){
                      JSONObject mbanner=  jsonArray.getJSONObject(i);
                        if(mbanner!=null){
                            HomeBannerBean item=new HomeBannerBean();
                            item.setAd_id(mbanner.getInt("ad_id"));
                            item.setAd_title(mbanner.getString("ad_title"));
                            item.setAd_imgs(mbanner.getString("ad_imgs"));
                            item.setAd_location_enum(mbanner.getInt("ad_location_enum"));
                            item.setAd_type_carid(mbanner.getInt("ad_type_carid"));

                            item.setAd_type_traderid(mbanner.getInt("ad_type_traderid"));

                            item.setAd_type_weburl(mbanner.getString("ad_type_weburl"));

                            item.setAd_type_brandenum(mbanner.getInt("ad_type_brandenum"));

                            item.setAd_type_carmodelid(mbanner.getInt("ad_type_carmodelid"));
                            item.setAddtime(mbanner.getString("addtime"));
                            item.setIsdel(mbanner.getBoolean("isdel"));
                            mHomeBannerBean.add(item);
                        }

                    }


                    return mHomeBannerBean;

                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

        return null;
    }

    public static List<CarBean> getCarBean(String jsonString) {
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            boolean error = jsonObject.has("success") ? jsonObject.getBoolean("success") : false;
            if (error) {
                JSONArray jsonArray=jsonObject.getJSONArray("json");
                if(jsonArray!=null&&jsonArray.length()>0){
                    List<CarBean> mHomeBannerBean=new ArrayList<>();
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject mbanner=  jsonArray.getJSONObject(i);
                        if(mbanner!=null){
                            CarBean item=new CarBean();
                            item.setCar_id(mbanner.getInt("car_id"));
                            item.setCar_all_title(mbanner.getString("car_all_title"));
                            item.setCar_att(mbanner.getInt("car_att"));
                            item.setCar_brandenum(mbanner.getInt("car_brandenum"));
                            item.setCar_specenum(mbanner.getInt("car_specenum"));
                            item.setCar_carmodelid(mbanner.getInt("car_carmodelid"));
                            item.setCar_traderid(mbanner.getInt("car_traderid"));
                            item.setCar_priceid(mbanner.getInt("car_priceid"));
                            item.setCar_title(mbanner.getString("car_title"));
                            item.setCar_price(mbanner.getDouble("car_price"));
                            item.setCar_color(mbanner.getString("car_color"));
                            item.setCar_interiorcolor(mbanner.getString("car_interiorcolor"));
                            item.setCar_marketprice(mbanner.getDouble("car_marketprice"));
                            item.setCar_province(mbanner.getInt("car_province"));
                            item.setCar_city(mbanner.getInt("car_city"));
                             item.setCar_sale_address(mbanner.getString("car_sale_address"));
                            item.setCar_isstock(mbanner.getBoolean("car_isstock"));

                            //car_falsestock_date
                            item.setCar_frameno(mbanner.getString("car_frameno"));

                            item.setCar_imgs(mbanner.getString("car_imgs"));

                            item.setCar_procedures(mbanner.getString("car_procedures"));

                            item.setCar_configure(mbanner.getString("car_configure"));

//                            car_remarks

                            item.setIssale(mbanner.getBoolean("issale"));

                           // item.setTruesale_price(mbanner.getDouble("truesale_price"));


                            item.setIshot(mbanner.getBoolean("ishot"));


                            item.setIssalestate(mbanner.getBoolean("issalestate"));

                            item.setIsdel(mbanner.getBoolean("isdel"));


                            item.setAddtime(mbanner.getString("addtime"));

                            item.setSpece_title(mbanner.getString("spece_title"));

//                           spece_ico


                            item.setBrand_id(mbanner.getInt("brand_id"));

                            item.setCarmodel_title(mbanner.getString("carmodel_title"));

                            item.setBrand_title(mbanner.getString("brand_title"));


                            item.setBrand_ico(mbanner.getString("brand_ico"));

                            item.setTrader_title(mbanner.getString("trader_title"));


                            item.setTrader_company(mbanner.getString("trader_company"));



                            item.setTrader_logo(mbanner.getString("trader_logo"));

                            item.setTrader_tel(mbanner.getString("trader_tel"));

                            item.setTrader_mobile(mbanner.getString("trader_mobile"));
                            item.setCar_cartypenum(mbanner.getInt("car_cartypenum"));

                            item.setCartype_title(mbanner.getString("cartype_title"));

                            item.setCar_click(mbanner.getInt("car_click"));

                            item.setCar_province_title(mbanner.getString("car_province_title"));

                            item.setCar_city_title(mbanner.getString("car_city_title"));

                            item.setTrader_province(mbanner.getInt("trader_province"));

                            item.setTrader_city(mbanner.getInt("trader_city"));

                            item.setTrader_company_address(mbanner.getString("trader_company_address"));

                            item.setCarmodel_ico(mbanner.getString("carmodel_ico"));

                            item.setCar_coverimgs(mbanner.getString("carmodel_ico"));

                            item.setCar_trueclick(mbanner.getInt("car_trueclick"));
                            item.setIsaudit(mbanner.getBoolean("isaudit"));
                            mHomeBannerBean.add(item);
                        }

                    }


                    return mHomeBannerBean;

                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

        return null;
    }

    public static List<CarSourceBean> getCarSrouceBean(String jsonstring) {
        try {
            JSONObject jsonObject = new JSONObject(jsonstring);
            boolean error = jsonObject.has("success") ? jsonObject.getBoolean("success") : false;
            if (error) {
                JSONArray jsonArray=jsonObject.getJSONArray("json");
                if(jsonArray!=null&&jsonArray.length()>0){
                    List<CarSourceBean> mHomeBannerBean=new ArrayList<>();
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject mbanner=  jsonArray.getJSONObject(i);
                        if(mbanner!=null){
                            CarSourceBean item=new CarSourceBean();
                            item.setCarmodel_id(mbanner.getInt("carmodel_id"));
                            item.setCarmedel_brandenum(mbanner.getInt("carmedel_brandenum"));
                            item.setCarmodel_title(mbanner.getString("carmodel_title"));
                            item.setAddtime(mbanner.getString("addtime"));
                            item.setIsdel(mbanner.getBoolean("isdel"));
                            item.setBrand_title(mbanner.getString("brand_title"));
                            item.setBrand_ico(mbanner.getString("brand_ico"));
                            item.setBrand_jpy(mbanner.getString("brand_jpy"));
                            item.setBrand_py(mbanner.getString("brand_py"));
                            item.setCarmodel_ico(mbanner.getString("carmodel_ico"));
                            item.setCarmodel_fmimgs(mbanner.getString("carmodel_fmimgs"));
                            mHomeBannerBean.add(item);
                        }

                    }


                    return mHomeBannerBean;

                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
        return null;
    }
}