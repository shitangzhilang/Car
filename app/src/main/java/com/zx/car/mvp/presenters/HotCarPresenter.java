package com.zx.car.mvp.presenters;

import android.os.AsyncTask;

import com.zx.car.api.model.CarModel;
import com.zx.car.bean.CarBean;
import com.zx.car.mvp.handlers.HotCarListem;

import java.util.List;

/**
 * Created by Administrator on 2016/8/1.
 */
public class HotCarPresenter {
    HotCarListem mListem;
    AsyncTask mTask;
    public HotCarPresenter(){

    }


    public void requestData(int sore,int pageindex,int pagesize){
        if(mTask!=null){
            mTask.cancel(true);
            mTask=null;
        }

        mTask=new BannerTask();
        mTask.execute(sore,pageindex,pagesize);
    }


    public void onResume(HotCarListem mListem){
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
    public class BannerTask extends  AsyncTask<Object,Integer,List<CarBean>>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if(mListem!=null)
                mListem.start();
        }

        @Override
        protected List<CarBean> doInBackground(Object... params) {
            int sort= (int) params[0];
            int pageindex= (int) params[1];
            int pagesize= (int) params[2];
            return new CarModel().getData(sort,pageindex,pagesize);
        }

        @Override
        protected void onPostExecute(List<CarBean> homeBannerBeen) {

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
