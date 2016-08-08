package com.zx.car;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by Alex.chen on 2016/8/6 0006 16:26.
 */
public class FavoriteCarShopActivity extends Activity implements View.OnClickListener,AdapterView.OnItemClickListener{
    private ListView lv_car_shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_car_shop);

        init();
    }

    private void init() {
        findViewById(R.id.iv_back).setOnClickListener(this);

        lv_car_shop = (ListView) findViewById(R.id.lv_car_shop);
        lv_car_shop.setAdapter(new FavoriteCarShopAdapter());
        lv_car_shop.setOnItemClickListener(this);
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
        startActivity(new Intent(this, FavoriteCarShopDetailActivity.class));
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
                convertView = LayoutInflater.from(FavoriteCarShopActivity.this).inflate(R.layout.item_favorite_car_shop,null);
            }

            return convertView;
        }

        private class ViewHolder{

        }
    }
}
