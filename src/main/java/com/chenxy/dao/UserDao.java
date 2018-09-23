package com.chenxy.dao;

import com.chenxy.bean.UserEntity;

import java.util.List;

/**
 * 数据访问层
 * @author LinkinStar
 */

public interface UserDao {

    /**
     * 查询数据
     * @return 用户列表
     */
    List<UserEntity> listUser();

    /**
     * 添加数据
     */
    boolean addUser();
}
