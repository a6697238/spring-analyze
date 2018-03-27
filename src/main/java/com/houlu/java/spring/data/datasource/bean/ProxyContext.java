package com.houlu.java.spring.data.datasource.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author Lu Hou
 * @date 2017/9/24
 * @time 下午10:47
 */
@Setter
@Getter
public class ProxyContext {

    private List<ResultSet> resultSetList;

    private List<PreparedStatement> preparedStatementList;
}
