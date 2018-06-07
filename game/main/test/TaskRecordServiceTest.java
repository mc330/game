import api.server.GameApplication;
import api.server.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2017/9/21-11:33.
 * Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GameApplication.class)
public class TaskRecordServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void insertTest(){
        userService.selectByExample();
    }
}