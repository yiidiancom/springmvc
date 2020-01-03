package com.yiidian.controller;

import com.yiidian.domain.User;
import com.yiidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     */
    @RequestMapping("/list")
    public String list(Model model){
        //调用业务层方法
        List<User> list = userService.findAll();

        //存入数据到request域
        model.addAttribute("list",list);
        //返回list.jsp页面
        return "list";
    }
}
