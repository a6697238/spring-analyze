package com.houlu.java.spring.data.jdbc.dao;


import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import com.houlu.java.spring.data.jdbc.mapper.UserJdbcMapper;

import javax.sql.DataSource;
import java.util.List;

/**
 * 类名称: UserJdbcDao <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/12 上午10:42
 */
public interface UserJdbcDao {

    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    public void create(UserEntity userEntity);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */

    public List<UserEntity> getUserByName(String userName);



    public UserEntity getUser(String name);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */


    public List<UserEntity> listUsers();
    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public void delete(Long id);
    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    public void update(UserEntity userEntity);

}
