package com.leng.oldass.filter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 认证 filter
 *
 * @author lengzq
 * @since 2022/1/13 0:49
 */
public class LoginFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authenticationManager;

}
