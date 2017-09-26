package spring.jdbc;

import com.houlu.java.spring.data.jdbc.dao.UserJdbcDao;
import com.houlu.java.spring.data.jdbc.entity.UserEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.BaseTest;

/**
 * @author Lu Hou
 * @date 2017/9/23
 * @time 下午1:35
 */
public class DriverManagerDataSourceTest extends BaseTest{

    @Autowired
    private UserJdbcDao userJdbcDao;

    @Test
    public void insertTest(){
        userJdbcDao.create(new UserEntity());
    }
}
