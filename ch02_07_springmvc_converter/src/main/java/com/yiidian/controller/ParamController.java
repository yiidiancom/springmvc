package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 自定义类型转换
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(User user){
        System.out.println("用户名："+user.getUsername());
        System.out.println("生日："+user.getBirthday());
        return "success";
    }
}
