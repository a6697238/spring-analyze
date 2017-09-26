package spring.aop.aspect;

import spring.BaseTest;
import com.houlu.java.spring.aop.bean.Chinese;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类名称: AfterReturningTest <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/17 下午12:15
 */
public class AfterReturningTest extends BaseTest {

    @Autowired
    private Chinese chinese;

    @Test
    public void afterReturning(){
        String result = chinese.sayHello("hello");
        System.out.println(result);
    }
}
