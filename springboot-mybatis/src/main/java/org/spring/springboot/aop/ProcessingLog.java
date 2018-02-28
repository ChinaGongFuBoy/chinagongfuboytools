package org.spring.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@Aspect
@Configuration
public class ProcessingLog {

    private static Logger log = LoggerFactory.getLogger(ProcessingLog.class);
    private ProceedingJoinPoint thisJoinPoint;

    @Pointcut("execution(* org.spring.springboot.controller.account.*.*(..))")
    public void excudeService(){}

    @Around("excudeService()")
    public Object around(ProceedingJoinPoint thisJoinPoint){
        Object obj = null;
        try {
            Object[] objs = thisJoinPoint.getArgs();
            Signature signature = thisJoinPoint.getSignature();
            StringBuilder paraderSirs = new StringBuilder();
            for(Object o : objs){
                if(!(o instanceof HttpServletRequest) && !(o instanceof HttpServletResponse)){
                    paraderSirs.append(o.toString()+",");
                }
            }
            String logStr = paraderSirs.toString();
            logStr = logStr.substring(0,logStr.length()-1);
            log.info("***************************入参的相关参数start*******************************");
            log.info("传入的参数:"+logStr);
            log.info("***************************入参的相关参数end*******************************");
            obj = thisJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace ();
        }
        return obj;
    }

}

