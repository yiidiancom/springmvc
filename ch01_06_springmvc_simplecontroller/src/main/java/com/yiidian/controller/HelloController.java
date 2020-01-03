package com.yiidian.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
public class HelloController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
        response.getWriter().write("Hello-www.yiidian.com");
        return null;
    }
}