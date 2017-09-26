package com.houlu.java.spring.data.jdbc.mapper;


import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 类名称: UserJdbcMapper <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/12 上午11:02
 */
public class UserJdbcMapper implements RowMapper<UserEntity> {
    public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(rs.getLong("id"));
        userEntity.setUserName(rs.getString("user_name"));
        userEntity.setSex(rs.getString("sex"));
        userEntity.setAge(rs.getLong("age"));
        userEntity.setEmail(rs.getString("email"));
        userEntity.setPhone(rs.getString("phone"));
        userEntity.setVersion(rs.getLong("version"));
        userEntity.setLastModifyTime(rs.getDate("last_modify_time"));
        userEntity.setCreateTime(rs.getDate("create_time"));
        return userEntity;
    }


}
