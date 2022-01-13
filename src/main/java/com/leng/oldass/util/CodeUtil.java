package com.leng.oldass.util;

import com.leng.oldass.controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * 验证码比对工具类
 *
 * @author lengzq
 * @since 2022/1/9 18:04
 */
public class CodeUtil {
    private static Logger logger = LoggerFactory.getLogger(CodeUtil.class);
    /**
     * 将获取到的前端参数转为String类型
     * @param request 请求
     * @param key 参数
     * @return null
     */
    public static String getString(HttpServletRequest request, String key){
        try{
            String result = request.getParameter(key);
            if(result != null){
                result = result.trim();
            }
            if("".equals(result)){
                result = null;
            }
            return result;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 验证码校验
     * @param request 请求
     * @return boolean
     */
    public static boolean checkVerifyCode(HttpServletRequest request){
        //获取生成的验证码
        String verifyCodeExpected = (String)request.getSession().getAttribute("verifyCode");
        logger.info("++++++++++++++verifyCodeExpected="+verifyCodeExpected);
        //获取用户输入的验证码
        String verifyCodeActual = CodeUtil.getString(request, "verifyCode");

        return verifyCodeActual != null && verifyCodeActual.equals(verifyCodeExpected);
    }

}
