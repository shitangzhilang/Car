package com.zx.car.utils;

import android.graphics.Rect;

/**
 * 监听区域发生改变
 * Created by ferris.xu on 2016/7/30.
 */
public class RectChageListem {
    private Rect mRect;
    public RectChageListem(Rect mRect){
        this.mRect=mRect;
    }
    public Rect getmRect() {
        return mRect;
    }

    public void setmRect(Rect mRect) {
        this.mRect = mRect;
    }
}
