package com.yiidian.dao;
import com.yiidian.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Dao接口
 */
public interface UserDao {
    /**
     * 查询所有账户
     */
    @Select("select * from user")
    public List<User> findAll();
}
