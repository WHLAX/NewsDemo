package com.example.newsdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.newsdemo.adapter.GridAadpter;
import com.example.newsdemo.adapter.MListAdapter;
import com.example.newsdemo.bean.Bean;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private GridView gridView;
    private ListView listView;
    private List<Bean> list = new ArrayList<Bean>();
     int[] image = {R.mipmap.gv1, R.mipmap.gv2, R.mipmap.gv3, R.mipmap.gv4,
            R.mipmap.gv5, R.mipmap.gv6, R.mipmap.gv7, R.mipmap.gv8, R.mipmap.gv9,
            R.mipmap.gv10, R.mipmap.gv11, R.mipmap.gv12, R.mipmap.gv13, R.mipmap.gv14,
    };
     String[] content = {"作家协会", "美术家协会", "杂技家协会", "戏剧家协会", "舞蹈家协会",
            "音乐家协会", "评论家协会", "曲艺家协会", "民间艺术家协会", "书法家协会",
            "电影家协会", "摄影家协会", "电视艺术家协会", "飞天编辑部",

    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new GridAadpter( list,MainActivity.this));
        listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(new MListAdapter());
        ScrollView sv= (ScrollView) findViewById(R.id.sv);
        sv.scrollTo(0,0);
        initGridView();
        initListView();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initListView() {
        for (int i=0;i<=14;i++){
            Bean bean=new Bean(image[i],content[i]);
            list.add(bean);
        }
    }

    private void initGridView() {
        for (int i=0;i<=14;i++){
            Bean bean=new Bean(image[i],content[i]);
            list.add(bean);
        }
    }


}
