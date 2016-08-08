package com.zx.car;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Alex.chen on 2016/8/6 0006 15:29.
 */
public class NewsActivity extends Activity implements View.OnClickListener{
    private ListView lv_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        init();
    }

    private void init() {
        findViewById(R.id.iv_news_back).setOnClickListener(this);

        lv_news = (ListView) findViewById(R.id.lv_news);
        lv_news.setAdapter(new NewsAdapter());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_news_back:
                finish();
                break;
        }
    }


    private class NewsAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 3;
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
                convertView = LayoutInflater.from(NewsActivity.this).inflate(R.layout.item_news,null);
                viewHolder = new ViewHolder();
                viewHolder.tv_news_time = (TextView) convertView.findViewById(R.id.tv_news_time);
                viewHolder.tv_news_msg = (TextView) convertView.findViewById(R.id.tv_news_msg);

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }


            return convertView;
        }

        class ViewHolder{
            private TextView tv_news_msg,tv_news_time;
        }
    }
}
