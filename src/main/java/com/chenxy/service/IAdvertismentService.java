package com.chenxy.service;

import com.chenxy.bean.AdvAdvert;
import com.github.pagehelper.PageInfo;

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

    /**
     * 分页查找
     * @param advAdvert
     * @param page
     * @param limit
     * @return
     */
    PageInfo selectPage(AdvAdvert advAdvert, int page, int limit);
}
