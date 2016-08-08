package com.zx.car;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by Alex.chen on 2016/8/6 0006 16:26.
 */
public class FavoriteCarShopDetailActivity extends Activity implements View.OnClickListener,AdapterView.OnItemClickListener{
    private ListView lv_favorite_car_shop_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_car_shop_detail);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        init();
    }

    private void init() {

        lv_favorite_car_shop_detail = (ListView) findViewById(R.id.lv_favorite_car_shop_detail);
        lv_favorite_car_shop_detail.setAdapter(new FavoriteCarShopAdapter());
        lv_favorite_car_shop_detail.setFocusable(false);
        lv_favorite_car_shop_detail.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private class FavoriteCarShopAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        ViewHolder viewHolder;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = LayoutInflater.from(FavoriteCarShopDetailActivity.this).inflate(R.layout.item_favorite_car,null);
            }

            return convertView;
        }

        private class ViewHolder{

        }
    }
}
