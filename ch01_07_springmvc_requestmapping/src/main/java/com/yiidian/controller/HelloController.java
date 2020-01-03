package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
@RequestMapping("/yiidian")
public class HelloController{
    @RequestMapping(value = "/hello.do",headers = "Referer=http://www.yiidian.com/")
    public void hello(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello-www.yiidian.com");
    }
}