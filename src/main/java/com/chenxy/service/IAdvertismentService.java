package com.chenxy.service;

import com.chenxy.bean.AdvAdvert;

import java.util.List;

/**
 * 广告
 * @author chxy
 */
public interface IAdvertismentService {
    /**
     * 查找
     * @param advAdvert
     * @return
     */
    List<AdvAdvert> select(AdvAdvert advAdvert);
}
