package com.leng.oldass.controller;

import com.leng.oldass.config.SecurityConfig;
import com.leng.oldass.entity.User;
import com.leng.oldass.service.impl.UserServiceImpl;
import com.leng.oldass.util.CodeUtil;
import com.leng.oldass.util.RespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengzq
 * @since 2021/11/26 16:10
 */
@RestController
public class LoginController {

    @Autowired
    private UserServiceImpl userService;
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login")
    public RespBean login(){
        return RespBean.error("您还未登录，请登录！");
    }

    @RequestMapping(value = "/home")
    public RespBean home(){
        return RespBean.error("权限问题");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public RespBean register(HttpServletRequest request){
        if(!CodeUtil.checkVerifyCode(request)){
            return RespBean.error("验证码错误",1001);
        }else {
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(userService.isExistUser(email)){
                return RespBean.error("该邮箱已被注册",1002);
            }else if(userService.isExistUserName(username)){
                return RespBean.error("用户名已被注册",1003);
            }else{
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setEmail(email);
                user.setEnabled(false);
                userService.insert(user);
            }
            return RespBean.success("注册成功",200);
        }
    }
}