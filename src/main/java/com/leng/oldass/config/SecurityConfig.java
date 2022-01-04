package com.leng.oldass.config;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leng.oldass.service.impl.UserServiceImpl;
import com.leng.oldass.util.RespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.cors.CorsUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lengzq
 * @since 2021/11/26 16:12
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    @Autowired
    private UserServiceImpl userService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
                .antMatchers("/login").permitAll()
                // 登录响应
                .and().formLogin().failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException e) throws IOException {
                        resp.setContentType("application/json;charset=utf-8");
                        RespBean rm;
                        if (e instanceof BadCredentialsException || e instanceof UsernameNotFoundException) {
                            rm = RespBean.error("账户名或者密码输入错误!", "");
                        } else if (e instanceof LockedException) {
                            rm = RespBean.error("账户被锁定，请联系管理员!", "");
                        } else if (e instanceof CredentialsExpiredException) {
                            rm = RespBean.error("密码过期，请联系管理员!", "");
                        } else if (e instanceof AccountExpiredException) {
                            rm = RespBean.error("账户过期，请联系管理员!", "");
                        } else if (e instanceof DisabledException) {
                            rm = RespBean.error("账户被禁用，请联系管理员!", "");
                        } else {
                            rm = RespBean.error("登录失败!", "");
                        }
                        logger.info(JSON.toJSONString(rm));
                        resp.setStatus(401);
                        PrintWriter out = resp.getWriter();
                        out.write(JSON.toJSONString(rm));
                        out.flush();
                        out.close();
                    }
                }).successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication auth)
                            throws IOException {
                        resp.setContentType("application/json;charset=utf-8");
                        Object curUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                        RespBean rm = RespBean.success("登录成功!", curUser);
                        ObjectMapper om = new ObjectMapper();
                        PrintWriter out = resp.getWriter();
                        out.write(om.writeValueAsString(rm));
                        out.flush();
                        out.close();
                    }
                }).permitAll()
                // 退出登录
                .and().logout().logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication)
                            throws IOException, ServletException {
                        resp.setContentType("application/json;charset=utf-8");
                        PrintWriter out = resp.getWriter();
                        out.flush();
                        out.close();
                    }
                }).permitAll()

                // 这里还是要关闭crsf因为crsf还有token之类的安全防护
                // 这就是这种方式不安全的原因吧
                .and().csrf().disable();

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }
}
