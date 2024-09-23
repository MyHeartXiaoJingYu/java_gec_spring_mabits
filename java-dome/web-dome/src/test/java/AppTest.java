import com.gec.App;
import com.gec.mapper.UserMapper;
import com.gec.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


// 关联启动类
@SpringBootTest(classes = App.class)


// 关联测试类
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {



    // spring 中DI
//    @Autowired
//    private UserService userService;

    @Autowired
    private UserMapper userMapper;


    @Test
//    public void test1() {
//
//
////        List<User> userList = userService.findUserList();
////        userList.forEach(System.out::println);
//
//        List<User> userList = userMapper.findUserList();
//        userList.forEach(System.out::println);
//
//
//
//    }

//    public void test2(){
//        User user = new User("1", 1, "1", "1");
//        userMapper.insertUser(user);
//    }

//    public void test3(){
//        User user = this.userMapper.findUserById(14);
//        System.out.println(user);
//    }

//    public void test4(){
//        User user = new User("2", 2, "2", "2",14);
//        boolean i = this.userMapper.updateUserById(user);
//        System.out.println(i);
//    }

    public void  test5(){
        int i = this.userMapper.deleteUserById(22);
        System.out.println(i);
    }
}