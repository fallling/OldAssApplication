package com.leng.oldass.util;

import java.io.Serializable;

/**
 * 统一REST API
 *
 * @author lengzq
 * @since 2022/3/19 23:05
 */
public class Result<T> implements Serializable {

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应数据
     */
    private T data;


    /**
     * 错误信息
     */
    private String message;

    /**
     * 构造器私有，外部不可创建
     */
    private Result(){
        this.code = 200;
        this.success = true;
    }

    private Result(T obj) {
        this.code = 200;
        this.data = obj;
        this.success = true;
    }

    private Result(ResultCode resultCode){
        this.success = false;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    /**
     * 通用返回成功（无返回结果）
     * @return 无返回
     */
    public static<T> Result<T> success(){
        return new Result<>();
    }


    /**
     * 返回成功
     * @param data 数据
     * @return 成功
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    public static <T> Result<T> failure(ResultCode resultCode){
        return new Result<T>(resultCode);
    }

    public Boolean getSuccess(){
        return success;
    }

    public Integer getCode(){
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }

    public void getMessage(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
