package com.leng.oldass.login.entity;

import java.util.Collection;
import java.util.Date;
import java.io.Serial;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 用户(User)表实体类
 *
 * @author lengzq
 * @since 2022-03-20 02:31:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends Model<User> implements UserDetails {
    
    @Serial
    private static final long serialVersionUID = 853653676739384949L;
    
    /**
     * 用户ID
     */
    @TableId
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 个性签名
     */
    private String userIntro;
    /**
     * 头像图片
     */
    private String avatar;
    /**
     * 邮件地址
     */
    private String email;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 密码
     */
    private String userPass;
    /**
     * 用户状态
     */
    private String userStatus;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return userPass;
    }

    @Override
    public String getUsername() {
        return userName;
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
        return true;
    }
}

