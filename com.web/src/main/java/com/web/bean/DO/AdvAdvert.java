package com.web.bean.DO;

import java.util.Date;

/**
 * 广告表
 * @author chxy
 */
public class AdvAdvert {

    //主键id
    private int id;
    //标题
    private String title;

    private String content;

    private String url;

    private String pic;

    private double waste_token;

    private int must_click;

    private int count_click;

    private Date add_time;

    /**
     * 状态
     */
    private int status;

    /**
     * 商家id
     */
    private int businessId;

    /**
     * 排名
     */
    private int rank;

    /**
     * 单次点击的金额
     */
    private double clickToken;

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    public double getWaste_token() {
        return waste_token;
    }

    public void setWaste_token(double waste_token) {
        this.waste_token = waste_token;
    }

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

    public double getClickToken() {
        return clickToken;
    }

    public void setClickToken(double clickToken) {
        this.clickToken = clickToken;
    }
}
