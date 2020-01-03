package com.yiidian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *  控制器方法返回值
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class ReturnController {

    /**
     * 1)字符串 - 普通字符串（代表页面名称，不是完整路径，最后经过视图解析器的解析）
     *    优势：写法简单
     *    劣势：只能转发到视图解析器指定的特定目录
     */
    @RequestMapping("/string")
    public String string(){
        System.out.println("一点教程网-普通字符串....");
        //这里返回页面名称，必须经过视图解析器解析的！！！
        return "index";
    }

    /**
     * 2)字符串 - 转发字符串
     *     转发字符串格式：
     *        forward:完整页面的路径      例如：forward:/pages/index.jsp
     *
     *    优势：更加灵活，可以转到本项目下的任何页面，可以传递request域对象数据
     *    劣势：写法稍复杂
     */
    @RequestMapping("/forward")
    public String forward(){
        System.out.println("一点教程网-转发字符串....");
        return "forward:/index.html";
    }

    /**
     * 3)字符串 - 重定向字符串
     *     重定向字符串格式：
     *        redirect:完整页面的路径      例如：redirect:/pages/index.jsp
     *
     *    优势：很灵活，可以重定向到项目内和项目以外的页面
     *    劣势：写法稍复杂，不能转发requesy域对象数据
     */
    @RequestMapping("/redirect")
    public String redirect(){
        System.out.println("一点教程网-重定向字符串....");
        return "redirect:http://www.yiidian.com";
    }

    /**
     * 4）返回void
     *    用于文件下载
     */
    @RequestMapping("/void")
    public void returnVoid(HttpServletResponse response){
        System.out.println("void....");

        //模拟文件下载
        //1.读取需要下载的文件
        File file = new File("e:/spring.jpg");

        //2.构建文件输入流
        try {
            InputStream in = new FileInputStream(file);

            //3.获取文件输出流（从response对象获取）
            OutputStream out = response.getOutputStream();

            //4.边读边写
            byte[] buf = new byte[1024];
            int len = 0;

            while( (len = in.read(buf))!=-1  ){
                out.write(buf,0,len);
            }

            //5.流资源关闭
            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /**
     * 5)ModelAndView: 封装了Model数据和视图数据的对象
     */
    @RequestMapping("/mv")
    public ModelAndView mv(){
        ModelAndView mv = new ModelAndView();
        //设置模型数据
        mv.addObject("model","一点教程网");
        //设置视图数据
        mv.setViewName("index");
        return mv;
    }
}
