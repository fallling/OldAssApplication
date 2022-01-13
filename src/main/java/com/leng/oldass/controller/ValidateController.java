package com.leng.oldass.controller;

import com.google.code.kaptcha.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 验证码控制器
 *
 * @author lengzq
 * @since 2022/1/5 15:56
 */

@Controller
public class ValidateController {
    private Producer kaptchaProducer = null;
    private final Logger logger = LoggerFactory.getLogger(ValidateController.class);

    @Autowired
    public void setKaptchaProducer(Producer kaptchaProducer){
        this.kaptchaProducer = kaptchaProducer;
    }

    @GetMapping(value = "/getVerifyCode")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        response.setDateHeader("Expires",0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        String capText = kaptchaProducer.createText();
        request.getSession().setAttribute("verifyCode", capText);
        logger.info("=================verifyCode="+capText);
        BufferedImage bi = kaptchaProducer.createImage(capText);
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
