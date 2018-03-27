package com.houlu.java.spring.data.datasource.bean;

import com.houlu.java.spring.data.datasource.proxy.ProxyFactory;
import lombok.Setter;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author Lu Hou
 * @date 2017/9/23
 * @time 下午8:17
 */
public class ProxyDataSource implements DataSource{

    @Setter
    private DataSource dataSource;

    @Setter
    private PrintWriter logWriter;



    @Override
    public Connection getConnection() throws SQLException {
        ProxyContext proxyContext = new ProxyContext();
        proxyContext.setResultSetList(new ArrayList<>());
        proxyContext.setPreparedStatementList(new ArrayList<>());
        return ProxyFactory.getConnectionProxy(dataSource.getConnection(),proxyContext);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
