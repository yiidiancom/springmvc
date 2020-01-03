package com.yiidian.service;

import com.yiidian.domain.User;

import java.util.List;

/**
 * 业务层接口
 * 一点教程网 - www.yiidian.com
 */
public interface UserService {
    /**
     * 查询所有用户
     */
    public List<User> findAll();
}
