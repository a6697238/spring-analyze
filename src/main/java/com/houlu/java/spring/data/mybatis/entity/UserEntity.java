package com.houlu.java.spring.data.mybatis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * 类名称: UserEntity <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/12 上午10:25
 */
@Setter
@Getter
@ToString
public class UserEntity {

    Long id;

    String userName;

    String sex;

    Long age;

    String email;

    String phone;

    Long version;

    Date lastModifyTime;

    Date createTime;

}
