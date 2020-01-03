package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 普通参数封装
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(String username,Integer age){
        System.out.println("用户名："+username);
        System.out.println("年龄："+age);
        return "success";
    }
}
