package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  演示Java对象与Json字符串之间的转换
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class JsonController {

    /**
     * 1) 接收前台传递json字符串格式 @RequestBody: 把json字符串转为Java对象
     * 2) 后台Java对象转换json字符串： @ResponseBody
     */
    @RequestMapping("/json")
    @ResponseBody
    public User json(@RequestBody User user){
        System.out.println("前端发送的数据："+user);
        //后台返回json字符串给前端
        user.setId(368);
        user.setName("小苍");
        user.setAge(20);
        return user;
    }
}
