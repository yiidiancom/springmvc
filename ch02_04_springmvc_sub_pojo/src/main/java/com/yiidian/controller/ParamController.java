package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 包装Pojo参数封装
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(User user){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        System.out.println("省份："+user.getAddress().getProvince());
        System.out.println("城市："+user.getAddress().getCity());
        return "success";
    }
}
