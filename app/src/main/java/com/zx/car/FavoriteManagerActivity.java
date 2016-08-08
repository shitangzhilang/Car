package com.zx.car;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by Alex.chen on 2016/8/6 0006 16:26.
 */
public class FavoriteManagerActivity extends Activity implements View.OnClickListener{
    private ListView lv_car_manager;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_manager);

        init();
    }

    private void init() {
        findViewById(R.id.iv_back).setOnClickListener(this);
        findViewById(R.id.btn_favorite_mgr_add).setOnClickListener(this);

        lv_car_manager = (ListView) findViewById(R.id.lv_car_manager);
        lv_car_manager.setAdapter(new FavoriteManagerAdapter());

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
                break;
            case R.id.btn_favorite_mgr_add:
                mDrawerLayout.openDrawer(Gravity.RIGHT);
                break;
        }
    }

    private class FavoriteManagerAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 4;
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
                convertView = LayoutInflater.from(FavoriteManagerActivity.this).inflate(R.layout.item_favorite_manager,null);
            }

            return convertView;
        }

        private class ViewHolder{

        }
    }
}
