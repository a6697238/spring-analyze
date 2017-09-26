package com.houlu.java.spring.aop.test;

import com.houlu.java.spring.aop.factory.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类名称: FactoryBeanTest <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/18 下午6:45
 */
public class FactoryBeanTest {

    public static void main(String[] args) {
        // 创建 Spring 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config/spring-core.xml");
        Car car = ctx.getBean(Car.class);
        car.driveCar();
        car.saleCar();
        System.out.println(ctx.getBean("&carFactory").getClass());
        System.out.println(ctx.getBean("carFactory").getClass());



    }

}
