package com.chenxy.bean;

/**
 * 商家表
 * @author chxy
 */
public class AdvBusiness {

    private int id;

    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getFreeze_count() {
        return freeze_count;
    }

    public void setFreeze_count(double freeze_count) {
        this.freeze_count = freeze_count;
    }

    private double balance;

    private double freeze_count;



}
