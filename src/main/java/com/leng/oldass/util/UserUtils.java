package com.leng.oldass.util;

import com.leng.oldass.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * User工具类
 *
 * @author lengzq
 * @since 2021/11/23 18:05
 */
public class UserUtils {

    public static User getCurrentUser(){
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
