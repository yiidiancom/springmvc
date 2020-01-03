package com.yiidian.test;

import com.yiidian.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 单独测试Spring环境是否OK
 * 一点教程网 - www.yiidian.com
 */
@RunWith(SpringJUnit4ClassRunner.class) // 加载Spring环境
@ContextConfiguration("classpath:applicationContext.xml") //读取spring配置，创建IOC容器
public class TestSpring {
    //注入service对象
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        userService.findAll();
    }
}
