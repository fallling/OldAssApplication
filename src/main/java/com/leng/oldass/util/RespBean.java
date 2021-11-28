package com.leng.oldass.util;


/**
 * @author lengzq
 * @since 2021/11/23 17:57
 */

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

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object object){
        return new RespBean(500, msg, object);
    }


    private RespBean(){

    }

    private RespBean(Integer status, String msg, Object object){
        this.status = status;
        this.msg = msg;
        this.object = object;
    }
}
