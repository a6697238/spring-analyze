package com.houlu.java.spring.service;

import com.houlu.java.spring.data.jdbc.dao.UserJdbcDao;
import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lu Hou
 * @date 2017/11/2
 * @time 下午7:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJdbcDao userJdbcDao;

    @Override
    public void create(UserEntity userEntity) {
        userJdbcDao.create(userEntity);
    }

    @Override
    public void update(UserEntity userEntity) {

    }
}
