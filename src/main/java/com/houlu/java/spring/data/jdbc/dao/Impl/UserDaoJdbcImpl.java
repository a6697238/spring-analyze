package com.houlu.java.spring.data.jdbc.dao.Impl;

import com.houlu.java.spring.data.jdbc.dao.UserJdbcDao;
import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import com.houlu.java.spring.data.jdbc.mapper.UserJdbcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类名称: UserDaoJdbcImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/12 上午10:43
 */

@Component
public class UserDaoJdbcImpl implements UserJdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void create(UserEntity userEntity) {
        String SQL = "insert into jdbc_user (user_name,sex,age,email,phone,version,last_modify_time,create_time) values (?, ?,?,?,?,?, ?,?)";
        jdbcTemplate.update(SQL, new Object[]{userEntity.getUserName(),
                userEntity.getSex(),
                userEntity.getAge(),
                userEntity.getEmail(),
                userEntity.getPhone(),
                userEntity.getVersion(),
                userEntity.getLastModifyTime(),
                userEntity.getCreateTime()});
    }

    @Override
    public List<UserEntity> getUserByName(String userName) {
        String SQL = "select * from jdbc_user WHERE user_name = ?";
        List<UserEntity> userEntityList = jdbcTemplate.query(SQL,new Object[]{userName},
                new UserJdbcMapper());
        return userEntityList;
    }


    public UserEntity getUser(String name) {
        String SQL = "select * from jdbc_user WHERE user_name = ?";
        UserEntity userEntity = jdbcTemplate.queryForObject(SQL, new Object[]{name}, new UserJdbcMapper());
        return userEntity;


    }

    public List<UserEntity> listUsers() {
        String SQL = "select * from jdbc_user";
        List<UserEntity> userEntityList = jdbcTemplate.query(SQL,
                new UserJdbcMapper());
        return userEntityList;
    }

    public void delete(Long id) {
        String SQL = "delete from jdbc_user where id = ?";
        jdbcTemplate.update(SQL, id);
    }

    public void update(UserEntity userEntity) {
        String SQL = "update jdbc_user set user_name = ? ,sex = ?,age = ?,email = ?,phone=?,version=?,last_modify_time=? where id = ?";
        jdbcTemplate.update(SQL, new Object[]{
                userEntity.getUserName(),
                userEntity.getSex(),
                userEntity.getAge(),
                userEntity.getEmail(),
                userEntity.getPhone(),
                userEntity.getVersion(),
                userEntity.getLastModifyTime(),
                userEntity.getId()
        });
    }


}
