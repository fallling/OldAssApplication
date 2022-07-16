package com.leng.oldass.login.controller;

import com.leng.oldass.login.entity.User;
import com.leng.oldass.login.service.impl.UserServiceImpl;
import com.leng.oldass.util.CodeUtil;
import com.leng.oldass.util.RespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author lengzq
 * @since 2021/11/26 16:10
 */
@RestController
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login")
    public RespBean login(){
        return RespBean.error("您还未登录，请登录！");
    }

    @RequestMapping(value = "/home")
    public RespBean home(){
        return RespBean.error("权限问题");
    }

    @RequestMapping(value = "/register")
    public RespBean register(HttpServletRequest request){
        if(!CodeUtil.checkVerifyCode(request)){
            return RespBean.error("验证码错误",1001);
        }else {
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String nickName = request.getParameter("nickName");
            if(userService.isExistEmail(email)){
                return RespBean.error("该邮箱已被注册",1002);
            }else if(userService.isExistUserName(username)){
                return RespBean.error("用户名已被注册",1003);
            }else{
                User user = new User();
                user.setUserId(String.valueOf(UUID.randomUUID()));
                user.setUserName(username);
                user.setNickName(nickName);
                user.setUserPass(new BCryptPasswordEncoder().encode(password));
                user.setEmail(email);
                userService.save(user);
            }
            return RespBean.success("注册成功",200);
        }
    }
}