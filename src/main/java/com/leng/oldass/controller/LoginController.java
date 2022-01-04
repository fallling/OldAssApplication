package com.leng.oldass.controller;

import com.leng.oldass.util.RespBean;
import org.springframework.web.bind.annotation.*;

/**
 * @author lengzq
 * @since 2021/11/26 16:10
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public RespBean login(){
        return RespBean.error("您还未登录，请登录！");
    }

    @RequestMapping(value = "/home")
    public RespBean home(){
        return RespBean.error("权限问题");
    }
}