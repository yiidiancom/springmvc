package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @RequestParam注解的使用
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(@RequestParam("username") String name,
                       @RequestParam("age") Integer userAge){
        System.out.println("用户名："+name);
        System.out.println("年龄："+userAge);
        return "success";
    }
}
