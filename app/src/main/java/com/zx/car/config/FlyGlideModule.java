package com.zx.car.config;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.GlideModule;


import java.io.File;

/**
 * 对glide 图片加载进行配置
 * Created by ferris on 2015/12/1.
 */
public class FlyGlideModule implements GlideModule {
    public static final int yourSizeInBytes_disk=1024*1024*50;//默认50M本地缓存
    public static final int yourSizeInBytes_memory=1024*1024*15;//默认15M内存

    //                    Glide.get(iv_wallpaper.getContext()).clearDiskCache();
//                    Glide.get(iv_wallpaper.getContext()).clearMemory();
    @Override
    public void applyOptions(final Context context, GlideBuilder builder) {
        builder.setDiskCache(new DiskLruCacheFactory(new DiskLruCacheFactory.CacheDirectoryGetter() {
            @Override public File getCacheDirectory() {
                return new File(FlyEnvironment.getImageCache(context));
            }
        }, yourSizeInBytes_disk));

        builder.setMemoryCache(new LruResourceCache(yourSizeInBytes_memory));
    }



    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
