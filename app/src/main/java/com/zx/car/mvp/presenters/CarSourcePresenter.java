package com.zx.car.mvp.presenters;

import android.os.AsyncTask;

import com.zx.car.api.model.CarSourceModel;
import com.zx.car.bean.CarSourceBean;
import com.zx.car.mvp.handlers.CarSourceListem;

import java.util.List;

/**
 * Created by Alex.chen on 2016/8/3 0003 17:11.
 */
public class CarSourcePresenter {
    CarSourceListem mListem;
    AsyncTask mTask;
    public CarSourcePresenter(){

    }


    public void requestData(){
        if(mTask!=null){
            mTask.cancel(true);
            mTask=null;
        }

        mTask=new CarSourceTask();
        mTask.execute();
    }


    public void onResume(CarSourceListem mListem){
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
    public class CarSourceTask extends  AsyncTask<Object,Integer,List<CarSourceBean>>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            if(mListem!=null)
                mListem.start();
        }

        @Override
        protected List<CarSourceBean> doInBackground(Object... params) {
            return new CarSourceModel().getData(null);
        }

        @Override
        protected void onPostExecute(List<CarSourceBean> homeBannerBeen) {

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
