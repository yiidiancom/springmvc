package com.yiidian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @ModelAttribute注解的使用
 *  一点教程网 - www.yiidian.com
 */
@Controller
public class ModelAttributeController {

    //没有返回值的情况
   /* @ModelAttribute
    public void myModel(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
    }*/

    /**
     * 带返回值的情况
     * @param name
     */
   /* @ModelAttribute("name")
    public String myModel(@RequestParam(required = false) String name) {
        return name;
    }*/

   /* //应用在方法的参数行
    @RequestMapping(value = "/model")
    public String model(@ModelAttribute("name") String name) {
        System.out.println("name="+name);
        return "success";
    }*/

    //@ModelAttribute，@RequestMapping同时放在方法上
    @RequestMapping(value = "/model")
    @ModelAttribute("name")
    public String model(@RequestParam(required = false) String name) {
        return name;
    }
}
