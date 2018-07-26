package test;

import com.baizhi.Application;
import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class testdao {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void Tset(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
