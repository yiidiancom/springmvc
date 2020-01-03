package com.yiidian.test;

import com.yiidian.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试Spring与MyBatis环境是否OK
 * 一点教程网 - www.yiidian.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestSpringMyBatis {

    //从IOC容器中获取业务实现
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        System.out.println( userService.findAll());
    }

}
