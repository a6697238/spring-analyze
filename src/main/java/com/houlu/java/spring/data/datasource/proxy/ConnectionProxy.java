package com.houlu.java.spring.data.datasource.proxy;

import com.sun.deploy.net.proxy.ProxyHandler;
import com.sun.scenario.effect.impl.prism.PrTexture;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author Lu Hou
 * @date 2017/9/23
 * @time 下午8:18
 */
public class ConnectionProxy extends ProxyTemplate<Connection> {

    @Override
    public Object invokePoint(Object proxy, Method method, Object[] args) throws Exception {
        if ("prepareStatement".equals(method.getName())) {
            PreparedStatement preparedStatement1 = getTarget().prepareStatement((String) args[0]);
            PreparedStatement preparedStatement2 = getTarget().prepareStatement((String) args[0]);
            getProxyContext().getPreparedStatementList().add(preparedStatement1);
            getProxyContext().getPreparedStatementList().add(preparedStatement2);
            return ProxyFactory.getPreparedStatementProxy(getTarget().prepareStatement((String) args[0]),getProxyContext());
        }
        return method.invoke(getTarget(), args);
    }
}
