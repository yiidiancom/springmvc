package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *  演示RESTful风格的开发
 * 一点教程网 - www.yiidian.com
 */
@Controller
@RequestMapping("/rest")
public class RestfulController {

    /**
     * 增加
     */
    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("增加...");
        return "success";
    }

    /**
     * 查询
     */
    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public String find(){
        System.out.println("查询...");
        return "success";
    }


    /**
     * 修改
     */
    @RequestMapping(value = "/{id}",method= RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable("id") Integer id){
        System.out.println("修改...id="+id);
        return "success";
    }


    /**
     * 删除
     */
    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable("id") Integer id){
        System.out.println("删除...id="+id);
        return "success";
    }
}
