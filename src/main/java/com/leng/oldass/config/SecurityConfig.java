package com.leng.oldass.config;

import com.alibaba.fastjson.JSON;
import com.leng.oldass.login.service.impl.UserServiceImpl;
import com.leng.oldass.security.CustomizeAuthenticationSuccessHandler;
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
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CustomizeAuthenticationSuccessHandler successHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
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
                .antMatchers("/test").permitAll();
        // ????????????
        http.formLogin().failureHandler(new AuthenticationFailureHandler() {
            @Override
            public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException e) throws IOException {
                resp.setContentType("application/json;charset=utf-8");
                RespBean rm;
                if (e instanceof BadCredentialsException || e instanceof UsernameNotFoundException) {
                    rm = RespBean.error("?????????????????????????????????!", "");
                } else if (e instanceof LockedException) {
                    rm = RespBean.error("????????????????????????????????????!", "");
                } else if (e instanceof CredentialsExpiredException) {
                    rm = RespBean.error("?????????????????????????????????!", "");
                } else if (e instanceof AccountExpiredException) {
                    rm = RespBean.error("?????????????????????????????????!", "");
                } else if (e instanceof DisabledException) {
                    rm = RespBean.error("????????????????????????????????????!", "");
                } else {
                    rm = RespBean.error("????????????!", 1004);
                }
                logger.info(JSON.toJSONString(rm));
                resp.setStatus(401);
                PrintWriter out = resp.getWriter();
                out.write(JSON.toJSONString(rm));
                out.flush();
                out.close();
            }
        }).successHandler(successHandler).permitAll();

        // ????????????
        http.logout().logoutSuccessHandler(new LogoutSuccessHandler() {
            @Override
            public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication)
                    throws IOException, ServletException {
                resp.setContentType("application/json;charset=utf-8");
                PrintWriter out = resp.getWriter();
                out.flush();
                out.close();
            }
        }).permitAll();

        // ?????????????????????crsf??????crsf??????token?????????????????????
        // ??????????????????????????????????????????
        http.csrf().disable();

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }
}
