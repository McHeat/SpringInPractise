package com.cn.mcheat.gen.upload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/10.
 */
@Controller
public class FileUploadController {

    private final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Autowired
    private HttpServletRequest request;

    //使用此方式需配置MultipartResolver
    @RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
    @ResponseBody
    public String processRegistration(@RequestPart("pic") MultipartFile pic, Map<String, Object> model) {
        try {
            File file = new File(pic.getOriginalFilename());
            logger.info(file.getPath());
            pic.transferTo(file);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return "redirect:home";
    }

    //不需要配置MultipartResolver
    @RequestMapping(value = "/uploadImgPart", method = RequestMethod.POST)
    //   @ResponseBody
    public String processRegistration(@RequestPart("pic") Part pic, Map<String, Object> model) {
        try {
            String path = request.getContextPath() + "/upload/";
            pic.write(pic.getSubmittedFileName());
            model.put("filePath", path + pic.getSubmittedFileName());
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return "redirect:home";
    }

}
