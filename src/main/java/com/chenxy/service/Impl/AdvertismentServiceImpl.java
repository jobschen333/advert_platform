package com.chenxy.service.Impl;

import com.chenxy.bean.AdvAdvert;
import com.chenxy.dao.AdvAdvertDao;
import com.chenxy.service.IAdvertismentService;
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
}
