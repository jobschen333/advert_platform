package com.chenxy.bean;

/**
 * 商家广告映射表
 * @author chxy
 */
public class AdvBusinessAdvertMap {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdvert_id() {
        return advert_id;
    }

    public void setAdvert_id(int advert_id) {
        this.advert_id = advert_id;
    }

    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int business_id) {
        this.business_id = business_id;
    }

    private int id;

    private int advert_id;

    private int business_id;


}
