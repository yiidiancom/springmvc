package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("进入控制器的方法");

        //注意：这里返回的只是页面名称，不是完整的页面访问路径
        return "success";
    }
}
