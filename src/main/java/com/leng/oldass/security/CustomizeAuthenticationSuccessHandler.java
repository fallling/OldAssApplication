package com.leng.oldass.security;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leng.oldass.controller.ValidateController;
import com.leng.oldass.entity.User;
import com.leng.oldass.util.RespBean;
import com.leng.oldass.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 登录成功处理请求
 * @author lengzq
 * @since 2022/1/11 23:03
 */
@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final Logger logger = LoggerFactory.getLogger(ValidateController.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        logger.info("登录成功");
        httpServletResponse.setContentType("application/json;charset=utf-8");
        Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        logger.info("user: "+user);
        String token = TokenUtil.createToken(user);
        RespBean respBean = RespBean.success("登录成功", user);
        httpServletResponse.setHeader("token", token);
        ObjectMapper om = new ObjectMapper();
        PrintWriter out = httpServletResponse.getWriter();
        out.write(om.writeValueAsString(respBean));
        out.flush();
        out.close();
    }
}
