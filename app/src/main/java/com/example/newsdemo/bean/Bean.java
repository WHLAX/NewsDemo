package com.example.newsdemo.bean;

/**
 * Created by 王浩雷 on 2016/11/3.
 */
public class Bean {
    private int imageid;
    private String content;

    public Bean(int imageid,String content) {
        this.imageid = imageid;
        this.content = content;
    }

    public Bean() {

    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
