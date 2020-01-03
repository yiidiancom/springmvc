package com.yiidian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *  @SessionAttributes注解的使用
 *  一点教程网 - www.yiidian.com
 */
@Controller
@SessionAttributes(names = "name",types = String.class)
public class SessionAttributesController {

    @RequestMapping(value = "/session")
    public String model(Model model) {
        model.addAttribute("name","一点教程网");
        return "success";
    }
}
