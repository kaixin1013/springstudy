package work;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by hp on 2019/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations = {"/bean.xml"})
public class UserLoginTest {
@Autowired
    private UserLogin userLogin;

    @Test
    public void userLogin() throws Exception {
        assertEquals(false,userLogin.getUser());


    }



}