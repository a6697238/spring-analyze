package com.houlu.java.spring.aop.bean;

import org.springframework.stereotype.Component;

/**
 * 类名称: Chinese <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/17 下午12:07
 */
@Component
public class ChineseImpl implements Chinese{
    // 实现 Person 接口的 sayHello() 方法
    public String sayHello(String name)
    {
        System.out.println("-- 正在执行 sayHello 方法 --");
        // 返回简单的字符串
        return name + " Hello , Spring AOP";
    }
    // 定义一个 eat() 方法
    public void eat(String food)
    {
        System.out.println("我正在吃 :"+ food);
    }
}
