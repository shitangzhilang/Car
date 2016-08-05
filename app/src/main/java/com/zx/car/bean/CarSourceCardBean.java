package com.zx.car.bean;

/**
 * Created by Alex.chen on 2016/8/3 0003 15:36.
 */
public class CarSourceCardBean {
    //字母
    public static final int PINYIN_TYPE_ITEM=0;
    //车类型
    public static final int CAR_BRAND_ITEM=1;
    //内容
    public static final int CONTENT_ITEM=2;
    //分割线
    public static final int LINE_ITEM=3;

    private int cardType = CONTENT_ITEM;

    public int getCardType() {
        return cardType;

    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }


    private String title;
    private String iconUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
