package com.zx.car.bean;

import android.widget.ImageView;

/**
 * Created by Administrator on 2016/8/1.
 */
public class CardBean  {

    public static final int CAR_ITEM=0;

    public static final int BANR_ITEM=1;

    private int cardType=CAR_ITEM;

    public int getCardType() {
        return cardType;

    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }
}
