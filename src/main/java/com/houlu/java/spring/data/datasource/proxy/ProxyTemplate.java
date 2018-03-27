package com.houlu.java.spring.data.datasource.proxy;

import com.houlu.java.spring.data.datasource.bean.ProxyContext;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Lu Hou
 * @date 2017/9/24
 * @time 下午1:44
 */
@Setter
@Getter
public abstract class ProxyTemplate<T> implements InvocationHandler {

    private ProxyContext proxyContext;

    private T target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // JDK居然连这些方法也被代理了
        if (method.getName().equals("equals")) {
            return proxy == args[0];
        } else if (method.getName().equals("hashCode")) {
            return super.hashCode();
        } else if (method.getName().equals("toString")) {
            return toString();
        }

        return invokePoint(proxy,method,args);
    }

    public abstract Object invokePoint(Object proxy, Method method, Object[] args) throws Exception;
}
