package com.chenxy.service.Impl;

import com.chenxy.bean.AdvUser;
import com.chenxy.bean.VO.UserVO;
import com.chenxy.service.IUserService;
import com.chenxy.bean.UserEntity;
import com.chenxy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 服务层
 * @author LinkinStar
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    /**
     * 获得user信息
     * @param id
     * @return
     */
    @Override
    public UserVO getUser(int id) {
        return userDao.getUser(id);
    }

    /**
     * 通过用户名和密码查找
     * @param userAccount
     * @param password
     * @return
     */
    @Override
    public AdvUser selectByUserAccountAndPassword(String userAccount, String password) {
        return userDao.selectByUserAccountAndPassword(userAccount, password);
    }

}
