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
public class FavoriteCarActivity extends Activity implements View.OnClickListener,AdapterView.OnItemClickListener{
    private ListView lv_favorite_car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_car);

        init();
    }

    private void init() {
        findViewById(R.id.iv_back).setOnClickListener(this);

        lv_favorite_car = (ListView) findViewById(R.id.lv_favorite_car);
        lv_favorite_car.setAdapter(new FavoriteCarAdapter());
        lv_favorite_car.setOnItemClickListener(this);
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
        startActivity(new Intent(this, FavoriteCarDetailActivity.class));
    }

    private class FavoriteCarAdapter extends BaseAdapter{

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
                convertView = LayoutInflater.from(FavoriteCarActivity.this).inflate(R.layout.item_favorite_car,null);
            }

            return convertView;
        }

        private class ViewHolder{

        }
    }
}
