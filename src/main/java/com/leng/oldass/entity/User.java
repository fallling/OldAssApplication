package com.leng.oldass.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * user表(User)实体类
 *
 * @author lengzq
 * @since 2021-11-23 14:37:08
 */
@Data
public class User implements Serializable, UserDetails {
    @Serial
    private static final long serialVersionUID = 839369750835881752L;
        /**
     * user id
     */
    private Integer id;
        /**
     * 姓名
     */
    private String name;
        /**
     * 手机号码
     */
    private String phone;
        /**
     * 邮箱
     */
    private String email;
    /**
     * 账户是否可用
     */
    @Getter(value = AccessLevel.NONE)
    private Boolean enabled;
        /**
     * 用户名
     */
    private String username;
        /**
     * 密码
     */
    private String password;
    /**
     * 用户头像
     */
    private String usrface;
        /**
     * 备注
     */
    private String remark;
    /**
     * 角色表
     */
    private List<Role> roles;

    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(roles != null) {
            List<GrantedAuthority> authorityList = new ArrayList<>();
            for (Role role : roles) {
                authorityList.add(new SimpleGrantedAuthority(role.getName()));
            }
            return authorityList;
        }else {
            return null;
        }
    }
}

