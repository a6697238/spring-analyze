package com.houlu.java.spring.aop.test;

import com.houlu.java.spring.aop.bean.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类名称: AroundAopTest <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/17 下午2:56
 */
public class AroundAopTest {

    public static void main(String[] args) {
        // 创建 Spring 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config/spring-core.xml");
        Chinese p = ctx.getBean(Chinese.class);
        System.out.println("正在执行的类:"+p.getClass());
        p.eat("西瓜");
    }
}
