package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @CookieValue注解获取指定Cookie数据
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class CookieController {

    @RequestMapping("/cookie.do")
    public String save(@CookieValue("JSESSIONID") String sessionId){
        System.out.println("JSESSIONID---"+sessionId);
        return "success";
    }
}
