package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Model与ModelMap的使用
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ModelController {

    /**
     * Model接口的使用
     * @return
     */
    @RequestMapping("/model")
    public String list(Model model){
        model.addAttribute("model","Model-一点教程网");
        return "success";
    }

    /**
     * ModelMap类的使用
     * @return
     */
    @RequestMapping("/modelMap")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("modelMap","ModelMap-一点教程网");
        return "success";
    }
}
