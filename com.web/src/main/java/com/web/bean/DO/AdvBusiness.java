package com.web.bean.DO;

/**
 * 商家表
 * @author chxy
 */
public class AdvBusiness {

    private int id;

    private int user_id;

    private double balance;

    private double freeze_count;

    private int status;

    private String companyName;

    private String personInCharge;

    private String personInChargePhone;

    private String companyAddress;

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


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getPersonInChargePhone() {
        return personInChargePhone;
    }

    public void setPersonInChargePhone(String personInChargePhone) {
        this.personInChargePhone = personInChargePhone;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
