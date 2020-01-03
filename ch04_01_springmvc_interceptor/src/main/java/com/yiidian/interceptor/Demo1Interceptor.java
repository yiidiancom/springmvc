package com.yiidian.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *  自定义拦截器
 *一点教程网 - www.yiidian.com
 */
public class Demo1Interceptor implements HandlerInterceptor{
    /**
     *preHandle: 在控制器(目标）的方法之前被执行
     *   返回值：控制afterCompletion方法是否被执行
     *       true: 执行afterCompletion
     *       false: 不执行afterCompletion
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("1.Demo1Interceptor的preHandle");
        return true;
    }

    /**
     * postHandle: 在控制器（目标）的方法成功执行完成之后（注意：控制器方法失败不执行）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("5.Demo1Interceptor的postHandle");
    }

    /**
     *  afterCompletion: 在执行完前面所有（拦截器和目标）的方法之后执行（注意: 不管控制器方法执行成功与否都会被执行 ）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("7.Demo1Interceptor的afterCompletion");
    }
}
