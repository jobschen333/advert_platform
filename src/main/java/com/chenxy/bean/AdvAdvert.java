package com.chenxy.bean;

import java.util.Date;

/**
 * 广告表
 * @author chxy
 */
public class AdvAdvert {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getWaste_token() {
        return waste_token;
    }

    public void setWaste_token(int waste_token) {
        this.waste_token = waste_token;
    }

    public int getMust_click() {
        return must_click;
    }

    public void setMust_click(int must_click) {
        this.must_click = must_click;
    }

    public int getCount_click() {
        return count_click;
    }

    public void setCount_click(int count_click) {
        this.count_click = count_click;
    }

    private int id;

    private String title;

    private String content;

    private String url;

    private String pic;

    private int waste_token;

    private int must_click;

    private int count_click;

    private Date add_time;

    /**
     * 排名
     */
    private int rank;

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }
}
