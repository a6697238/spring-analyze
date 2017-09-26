package com.houlu.java.spring.aop.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 类名称: ChineseFactory <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/18 下午6:38
 */
@Component
public class CarFactory implements FactoryBean<Car> {

    private Car car;

    @Override
    public Car getObject() throws Exception {
        if(car==null){
            this.car = new AudiCarImpl();
        }
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
