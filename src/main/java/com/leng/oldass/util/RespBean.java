package com.leng.oldass.util;


import lombok.Data;

/**
 * @author lengzq
 * @since 2021/11/23 17:57
 */

@Data
public class RespBean {
    private Integer status;
    private String msg;
    private Object object;

    public static RespBean build(){
        return new RespBean();
    }

    public static RespBean success(String msg){
        return new RespBean(200, msg, null);
    }

    public static RespBean success(String msg, Object object){
        return new RespBean(200, msg, object);
    }

    public static RespBean success(String msg, Integer status){
        return new RespBean(status, msg, null);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object object){
        return new RespBean(500, msg, object);
    }

    public static RespBean error(String msg, Integer status){
        return new RespBean(status, msg, null);
    }

    private RespBean(){

    }

    private RespBean(Integer status, String msg, Object object){
        this.status = status;
        this.msg = msg;
        this.object = object;
    }
}
