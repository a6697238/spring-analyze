package com.houlu.java.spring.data.jdbc.jdk;

import java.sql.*;

/**
 * @author Lu Hou
 * @date 2017/9/24
 * @time 下午1:00
 */
public class JdbcDemo {

    // JDBC driver name and spring-jdbc.sql URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://10.4.243.47:3306/waimai_db?Unicode=true&characterEncoding=utf8&allowMultiQueries=true";

    //  Database credentials
    static final String USER = "q3boy";
    static final String PASS = "alkf@xpdw";


    public static void main(String[] args) throws Exception{

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;

        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        //STEP 3: Open a connection
        System.out.println("Connecting to a selected spring-jdbc.sql...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected spring-jdbc.sql successfully...");

        //STEP 4: Execute a query
        System.out.println("Inserting records into the table...");
        stmt1 = conn.createStatement();
        stmt2 = conn.createStatement();


        String sql = "INSERT INTO jdbc_user " +"(user_name,sex,age,email,phone,version,last_modify_time,create_time)"+
                "VALUES ('test001',null,null,null,null,null,null,null)";
        stmt1.executeUpdate(sql);
        sql = "INSERT INTO jdbc_user " +"(user_name,sex,age,email,phone,version,last_modify_time,create_time)"+
                "VALUES ('test002',null,null,null,null,null,null,null)";
        stmt2.executeUpdate(sql);


        String sqlQuery = "select * from jdbc_user where user_name = ? "; // 这里用问号
        PreparedStatement preparedStatement1 = conn.prepareStatement(sqlQuery);
        preparedStatement1.setString(1,"test001"); // 这里将问号赋值

        PreparedStatement preparedStatement2 = conn.prepareStatement(sqlQuery);
        preparedStatement2.setString(1,"test002"); // 这里将问号赋值


        ResultSet rs1 = preparedStatement1.executeQuery();
        ResultSet rs2 = preparedStatement2.executeQuery();
        while(rs1.next()){
            System.out.println(rs1.getString("user_name"));
        }
        while(rs2.next()){
            System.out.println(rs2.getString("user_name"));
        }

    }

}
