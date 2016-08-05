package com.zx.car.mvp.presenters;

import android.os.AsyncTask;

import com.zx.car.api.model.HomeBannerModel;
import com.zx.car.bean.HomeBannerBean;
import com.zx.car.mvp.handlers.HomeBannerListem;

import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
public class HomeBannerPresenter {
    HomeBannerListem mListem;
    AsyncTask mTask;
    public HomeBannerPresenter(){

    }


    public void requestData(){
        if(mTask!=null){
            mTask.cancel(true);
            mTask=null;
        }

        mTask=new BannerTask();
        mTask.execute();
    }


    public void onResume(HomeBannerListem mListem){
        this.mListem=mListem;

    }

    public void onPause(){
        this.mListem=null;


    }


    public void onDestory(){
        mListem=null;
        if(mTask!=null){
            mTask.cancel(true);
            mTask=null;
        }
    }
    public class BannerTask extends  AsyncTask<Object,Integer,List<HomeBannerBean>>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if(mListem!=null)
            mListem.start();
        }

        @Override
        protected List<HomeBannerBean> doInBackground(Object... params) {
            return new HomeBannerModel().getData(null);
        }

        @Override
        protected void onPostExecute(List<HomeBannerBean> homeBannerBeen) {

            if(homeBannerBeen!=null){
                if(mListem!=null)
                    mListem.success(homeBannerBeen);
            }else{
                if(mListem!=null)
                    mListem.error("");
            }

        }
    }
}
