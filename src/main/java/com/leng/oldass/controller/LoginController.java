package com.leng.oldass.controller;

import com.leng.oldass.util.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lengzq
 * @since 2021/11/26 16:10
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(){
        return "hello";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
}
