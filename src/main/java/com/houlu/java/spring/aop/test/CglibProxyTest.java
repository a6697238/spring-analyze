package com.houlu.java.spring.aop.test;


import com.houlu.java.spring.aop.bean.ChineseImpl;
import com.houlu.java.spring.aop.cglib.CglibProxyDemo;

/**
 * 类名称: CglibProxyTest <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/17 下午4:44
 */
public class CglibProxyTest {

    public static void main(String[] args) {

        CglibProxyDemo cglibProxy = new CglibProxyDemo();
        ChineseImpl chineseProxy = (ChineseImpl) cglibProxy.getProxy(ChineseImpl.class);

        chineseProxy.sayHello("hello CGLIB");

    }
}
