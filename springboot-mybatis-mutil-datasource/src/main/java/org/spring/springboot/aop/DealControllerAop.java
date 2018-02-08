package org.spring.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.MyException;
import org.spring.springboot.constant.RestResponse;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yigang.wu
 * @date created in $time $date
 */
@Aspect
@Configuration
public class DealControllerAop {

    private static Logger log = LoggerFactory.getLogger(DealControllerAop.class);

    @Pointcut("execution(* org.spring.springboot.controller.*.*(..))")
    public void excudeService(){}

    @Around("excudeService()")
    public Object around(ProceedingJoinPoint thisJoinPoint){
        Object obj = null;
        try {
            String className = thisJoinPoint.getTarget().getClass().getName();
            String methodName = thisJoinPoint.getSignature().getName();
            Object[] args = thisJoinPoint.getArgs();//参数
            Signature signature = thisJoinPoint.getSignature();
            MethodSignature methodSignature = (MethodSignature)signature;
            String[] methodNames = methodSignature.getParameterNames();
            StringBuilder paraderSirs = new StringBuilder();
            for(int i= 0; i < args.length;i++){
                Object o = args[i];
                if(!(o instanceof HttpServletRequest) && !(o instanceof HttpServletResponse)){
                    paraderSirs.append(methodNames[i].toString()+":"+o.toString()+",");
                }
            }
            String logStr = paraderSirs.toString();
            logStr = logStr.substring(0,logStr.length()-1);
            log.info("***************************入参的相关参数start*******************************");
            log.info("类名："+className+",方法名:"+methodName+",参数名和值:{"+logStr+"}");
            log.info("***************************入参的相关参数end*******************************");
            obj = thisJoinPoint.proceed();
        } catch (Throwable e) {
            MyException myException = (MyException)e;
            RestResponse restResponse = new RestResponse();
            restResponse.setSuccess(false);
            restResponse.setMsg(myException.getMessage());
            restResponse.setCode(myException.getErrorCode());
            e.printStackTrace();
            return  restResponse;
        }
        return obj;
    }
}
