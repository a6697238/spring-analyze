package com.houlu.java.spring.data.pool.druid;

import com.houlu.java.spring.data.pool.c3p0.C3p0Utils;

import java.beans.PropertyVetoException;
import java.sql.*;

/**
 * @author Lu Hou
 * @date 2017/11/11
 * @time 上午10:07
 */
public class DruidClient {

    public static void main(String[] args) throws PropertyVetoException, SQLException, InterruptedException {

        Connection conn = DruidUtil.getConnection();

        //STEP 4: Execute a query
        System.out.println("Inserting records into the table...");
        Statement stmt = conn.createStatement();


        String sql = "INSERT INTO jdbc_user " +"(user_name,sex,age,email,phone,version,last_modify_time,create_time)"+
                "VALUES ('test001',null,null,null,null,null,null,null)";
        stmt.executeUpdate(sql);

        String sql2 = "INSERT INTO jdbc_user " +"(user_name,sex,age,email,phone,version,last_modify_time,create_time)"+
                "VALUES ('test001',null,null,null,null,null,null,null)";
        stmt.executeUpdate(sql2);

        String sqlQuery = "select * from jdbc_user where user_name = ? "; // 这里用问号
        PreparedStatement preparedStatement1 = conn.prepareStatement(sqlQuery);
        preparedStatement1.setString(1,"test001"); // 这里将问号赋值

        ResultSet rs1 = preparedStatement1.executeQuery();



        String sqlQuery2 = "select * from jdbc_user where user_name = ? "; // 这里用问号
        PreparedStatement preparedStatement2 = conn.prepareStatement(sqlQuery2);
        preparedStatement2.setString(1,"test001"); // 这里将问号赋值

        ResultSet rs2 = preparedStatement2.executeQuery();

//        Thread.sleep(10000);

        conn.close();


    }
}
