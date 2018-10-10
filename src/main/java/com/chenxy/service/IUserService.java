package com.chenxy.service;

import com.chenxy.bean.UserEntity;
import com.chenxy.bean.VO.UserVO;

import java.util.List;

/**
 * 服务层接口
 * @author LinkinStar
 */
public interface IUserService {

    /**
     * 查询数据
     */
    List<UserEntity> listUser();

    /**
     * 添加数据
     */
    boolean addUser();

    /**
     * 获得userInfo
     * @param id
     * @return
     */
    UserVO getUser(int id);
}
