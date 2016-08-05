package com.zx.car.config;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2016/7/31.
 */
public class FlyEnvironment {

    public final static String getImageCache(Context context) {
        String path = null;
        File cacheDir = getCache(context);
        if (cacheDir != null) {
            path = cacheDir.getAbsolutePath();
            path += "/imagecache/";
        } else {
            path = "/storage/sdcard0/Android/data/com.zx.car/cache/imagecache/";
        }
        return path;
    }

    private final static File getCache(Context context) {
        Context myContext =context;
        if (myContext == null) {
            return Environment.getDownloadCacheDirectory();
        } else {
            File external = myContext.getExternalCacheDir();
            if (external != null &&
                    (!Environment.isExternalStorageRemovable() ||
                            Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))) {
                return external;
            } else {
                return myContext.getCacheDir();
            }
        }
    }
}
