package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 *  演示Spring MVC表单数据验证
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ValidateController {

    @RequestMapping("/hello")
    public String save(@Valid User user, BindingResult result,Model model){
        //如果表单数据验证有异常
        if(result.hasErrors()){
            //取出所有失败信息
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError:fieldErrors){
                //把错误信息存入request域，传递到JSP页面显示
                model.addAttribute("ERROR_"+fieldError.getField(),fieldError.getDefaultMessage());
            }
            return "forward:/validate.jsp";
        }

        System.out.println("User="+user);
        return "success";
    }
}
