package com.yiidian.controller;
import com.yiidian.domain.Address;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * List集合参数封装
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ParamController {

    @RequestMapping("/param.do")
    public String save(User user){
        System.out.println("用户名："+user.getUsername());
        System.out.println("年龄："+user.getAge());
        //遍历所有地址信息
        for(Address addr:user.getAddress()){
            System.out.println(addr);
        }
        return "success";
    }
}
