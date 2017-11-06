package spring.service;

import com.houlu.java.spring.data.jdbc.dao.UserJdbcDao;
import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import com.houlu.java.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.BaseTest;

/**
 * @author Lu Hou
 * @date 2017/11/5
 * @time 上午10:38
 */
public class ServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertTest(){
        userService.create(new UserEntity());
    }
}
