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
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 *  演示Spring MVC文件上传
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class UploadController {

    /**
     * 接收文件
     */
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, MultipartFile imgFile,String memo){
        //1.获取网站的upload目录的路径： ServletContext对象
        String upload = request.getSession().getServletContext().getRealPath("/upload");

        //判断该目录是否存在，不存在，自己创建
        File uploadFile = new File(upload);
        if(!uploadFile.exists()){
            uploadFile.mkdir();
        }

        //把文件保存到upload目录

        //2.生成随机文件名称
        //2.1 原来的文件名
        String oldName = imgFile.getOriginalFilename();

        //2.2 随机生成文件名
        String uuid = UUID.randomUUID().toString();
        //2.3 获取文件后缀
        String extName = oldName.substring(oldName.lastIndexOf(".")); //.jpg

        //2.4 最终的文件名
        String fileName = uuid+extName;

        //3.保存
        try {
            imgFile.transferTo(new File(upload+"/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件描述："+memo);

        return "success";

    }
}
