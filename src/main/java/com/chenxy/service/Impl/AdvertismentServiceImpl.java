package com.chenxy.service.Impl;

import com.chenxy.bean.AdvAdvert;
import com.chenxy.dao.AdvAdvertDao;
import com.chenxy.service.IAdvertismentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 广告
 * @author chxy
 */

@Service("advertismentService")
public class AdvertismentServiceImpl implements IAdvertismentService {

    @Autowired
    private AdvAdvertDao advAdvertDao;

    /**
     * 查找
     * @param advAdvert
     * @return
     */
    @Override
    public List<AdvAdvert> select(AdvAdvert advAdvert) {
        return advAdvertDao.select(advAdvert);
    }

    /**
     * 分页查找
     * @param advAdvert
     * @param page
     * @param limit
     * @return
     */
    @Override
    public PageInfo selectPage(AdvAdvert advAdvert, int page, int limit) {
        PageHelper.startPage(page,limit);
        List<AdvAdvert> list = advAdvertDao.select(advAdvert);
        PageInfo<AdvAdvert> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
