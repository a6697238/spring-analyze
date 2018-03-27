package com.houlu.java.spring.aop.bean;

import org.springframework.stereotype.Component;

/**
 * @author Lu Hou
 * @date 2017/10/24
 * @time 上午10:12
 */
@Component
public class ChineseImplNoInterface {

    private void init(){
        System.out.println(ChineseImplNoInterface.class + " init ");
    }
}
