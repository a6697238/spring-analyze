package com.houlu.java.spring.service;

import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * @author Lu Hou
 * @date 2017/11/2
 * @time 下午7:57
 */
@Service
public interface UserService {

    public void create(UserEntity userEntity);

    public void update(UserEntity userEntity);


}
