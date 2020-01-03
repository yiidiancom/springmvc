package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @RequestHeader注解获取请求头信息
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(@RequestHeader("host") String host,
                       @RequestHeader("accept") String accept){
        System.out.println("host---"+host);
        System.out.println("accept---"+accept);
        return "success";
    }
}
