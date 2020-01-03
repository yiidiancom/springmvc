package com.yiidian.controller;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 *  演示Spring MVC文件下载
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class DownController {

    /**
     * 下载文件
     */
    @RequestMapping("/down")
    public void upload(HttpSession session, HttpServletResponse response) throws Exception {
        //模拟文件下载
        //1.读取需要下载的文件
        InputStream inputStream = session.getServletContext()
                .getResourceAsStream("/upload/spring.jpg");

        //2.输出文件
        //设置响应头
        response.setHeader("Content-Disposition","attachment;filename=spring.jpg");
        OutputStream outputStream = response.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while( (len = inputStream.read(buf))!=-1 ){
            outputStream.write(buf,0,len);
        }

        //3.关闭资源
        outputStream.close();
        inputStream.close();
    }
}
