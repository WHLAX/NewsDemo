package com.example.newsdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.newsdemo.R;
import com.example.newsdemo.bean.Bean;

import java.util.List;

/**
 * Created by 王浩雷 on 2016/11/3.
 */
public class MListAdapter extends BaseAdapter {
    private List<Bean> list;
    private Context context;

    public MListAdapter() {
        this.context = context;
    }
    public MListAdapter(List<Bean> list,Context context) {

        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = convertView.inflate(context, R.layout.list_item , null);
            viewHolder = new ViewHolder();
            viewHolder.TextView=(TextView) convertView.findViewById(R.id.textview);
            viewHolder.imageView= (ImageView) convertView
                    .findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.TextView.setText(list.get(position).getContent());
        viewHolder.imageView.setImageResource(list.get(position)
                .getImageid());
        return convertView;
    }
    public  class ViewHolder
    {
        ImageView imageView;
        TextView TextView;
    }

}
