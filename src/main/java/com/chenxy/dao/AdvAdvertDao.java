package com.chenxy.dao;

import com.chenxy.bean.AdvAdvert;

import java.util.List;

/**
 * 广告
 * @author chxy
 */
public interface AdvAdvertDao {

    List<AdvAdvert> select(AdvAdvert advAdvert);
}
