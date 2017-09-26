package com.houlu.java.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 类名称: AroundAdvice <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/17 下午2:56
 */
@Component
@Aspect
public class AroundAdvice {

    @Around("chinese()")
    public Object verify(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aroundAop 开始执行 ");

        Object[] args = point.getArgs();
        for(Object arg : args){
            System.out.println("传入参数:"+arg);
        }
        Object returnObj = point.proceed(args);
        System.out.println("执行结果:"+returnObj);
        System.out.println("aroundAop 执行结束 ");

        return returnObj;
    }


    @Pointcut("execution(* com.houlu.java.spring.aop.bean.Chinese.eat(..))")
    public void chinese() {}



}
