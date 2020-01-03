package com.yiidian.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 方式二：自定义异常处理类
 */
@ControllerAdvice
public class MyCustomException2{

    @ExceptionHandler
    public ModelAndView handlerError(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("errorMsg",e.getMessage());
        return mv;
    }

}

