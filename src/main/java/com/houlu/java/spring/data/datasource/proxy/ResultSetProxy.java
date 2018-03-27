package com.houlu.java.spring.data.datasource.proxy;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/9/23
 * @time 下午8:18
 */
public class ResultSetProxy extends ProxyTemplate<ResultSet> {

    private int index = 0;

    @Override
    public Object invokePoint(Object proxy, Method method, Object[] args) throws Exception {
        if("next".equals(method.getName())){
            return getResult();
        }
        return method.invoke(getTarget(), args);
    }

    private Object getResult() throws SQLException {
        if (index < getProxyContext().getResultSetList().size()) {
            setTarget(getProxyContext().getResultSetList().get(index));
            boolean ret =  getProxyContext().getResultSetList().get(index).next();
            if (ret) {
                return ret;
            } else {
                index++;
                return getResult();
            }
        }
        return false;
    }
}
