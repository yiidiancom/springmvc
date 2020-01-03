package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * 目标控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String upload(HttpSession session, HttpServletResponse response) throws Exception {
        System.out.println("3.目标控制器-HelloController");
        return "success";
    }
}
