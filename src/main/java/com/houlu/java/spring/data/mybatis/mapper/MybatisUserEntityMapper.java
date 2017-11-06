package com.houlu.java.spring.data.mybatis.mapper;


import com.houlu.java.spring.data.mybatis.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * 类名称: UserJdbcDao <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/12 上午10:42
 */
public interface MybatisUserEntityMapper {


    int insert(UserEntity record);


    UserEntity selectByPrimaryKey(Long id);

}
