package com.houlu.java.spring.aop.factory;

/**
 * 类名称: AudiCarImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/18 下午6:43
 */
public class AudiCarImpl implements Car {
    @Override
    public void driveCar() {
        System.out.println("audi car drive");
    }

    @Override
    public void saleCar() {
        System.out.println("audi car sale");

    }


}
