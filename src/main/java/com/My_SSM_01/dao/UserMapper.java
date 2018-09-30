package com.My_SSM_01.dao;

import com.My_SSM_01.entity.User;

import java.util.List;

/**
 * 处理用户的数据操作接口
 */
public interface UserMapper {

    /**
     * 添加用户
     * @param u
     * @return
     */
    Integer insert(User u);

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户id查询用户
     * @param userIds
     * @return
     */
    List<User> findByUserIds(List<Integer> userIds);
}
