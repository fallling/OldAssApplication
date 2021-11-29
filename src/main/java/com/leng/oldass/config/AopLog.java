package com.leng.oldass.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * AOP日志注解
 *
 * @author lengzq
 * @since 2021/11/28 14:25
 */

@Aspect
@Component
@Slf4j
public class AopLog {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 线程局部的变量，用于解决多线程中相同变量的访问冲突问题
     */
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    /**
     * 定义切点
     */
    @Pointcut("execution(public * com.leng..*(..))")
    public void aopWebLog(){
    }

    @Before("aopWebLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        startTime.set(System.currentTimeMillis());

        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(attributes != null){
            HttpServletRequest request = attributes.getRequest();

            //记录下请求内容
            logger.info("URL:" + request.getRequestURI());
            logger.info("HTTP方法:" + request.getMethod());
            logger.info("IP地址:" + request.getRemoteAddr());
            logger.info("请求参数:" + JSON.toJSONString(request.getParameterMap()));
            logger.info("类的方法" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        }

    }

    @AfterReturning(pointcut = "aopWebLog()", returning = "retObject")
    public void doAfterReturning(Object retObject) throws Throwable{
        //处理完请求，返回内容
        logger.info("应答值:" + JSON.toJSONString(retObject));
        logger.info("费时:" + (System.currentTimeMillis() - startTime.get()));
    }

    /**
     * 方法抛出异常退出时执行的通知
     * @param joinPoint 加入切点
     * @param e 异常
     */
    @AfterThrowing(pointcut = "aopWebLog()", throwing = "e")
    public void addAfterThrowingLogger(JoinPoint joinPoint, Exception e){
        logger.error("执行"+ joinPoint + "异常",e);
    }
}
