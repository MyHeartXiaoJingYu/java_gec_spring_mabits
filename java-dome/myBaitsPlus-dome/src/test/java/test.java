import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.gec.App;
import com.gec.mapper.UserMapper;
import com.gec.pojo.User;
import com.gec.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = App.class)

@RunWith(SpringJUnit4ClassRunner.class)

public class test {
    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void testSelectById(){
////根据id查询用户信息
////SELECT id,name,age,email FROM user WHERE id=?
//        User user = userMapper.selectById(4L);
//        System.out.println(user);
//    }

//    @Test
//    public void testSelectBatchIds(){
////根据多个id查询多个用户信息
////SELECT id,name,age,email FROM user WHERE id IN ( ? , ? )
//        List<Long> idList = Arrays.asList(4L, 5L);
//        List<User> list = userMapper.selectBatchIds(idList);
//        list.forEach(System.out::println);
//    }

    // 修改  1   根据id 查询
//    @Test
//    public void test3(){
//
//        // Wrapper  抽象类  ->  普通类QueryWrapper
//
//        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
//        //  select * from user where id=1
//        // 参数1 填写数据库表的列名   参数2  是具体的值
//        //  queryWrapper.eq()
//        queryWrapper.eq("id",1);
//
//
//        User user = this.userMapper.selectOne(queryWrapper);
//        System.out.println(user);
//    }

//    // 模糊查询
//    @Test
//    public void test4() {
//
//
//        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
//        queryWrapper.like("name","J");
//
//        // 根据J 去模糊查询操作
//        //   SELECT id,name AS namexxxx,age,email FROM tb_user WHERE (name LIKE ?)
//        List<User> users = this.userMapper.selectList(queryWrapper);
//        users.forEach(System.out::println);
//    }

//    // 修改
//    @Test
//    public void test5(){
//        User user = new User();
//        user.setName("tomding");
//        user.setAge(10);
//        user.setEmail("tomding@qq.com");
//
//        // 加上更新的条件
//        user.setId(3L);
//
//        int res = this.userMapper.updateById(user);
//        if (res>0){
//            System.out.println("更新数据成功");
//        }
//        else {
//            System.out.println("更新数据失败");
//        }
//
//    }
@Test
    public void test6(){

        int res = this.userMapper.deleteById(5L);
        if (res>0){
            System.out.println("删除数据成功");
        }
        else {
            System.out.println("删除数据失败");
        }

    }

    // 批量删除
    @Test
    public void test7(){

        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);

        //  DELETE FROM tb_user WHERE id IN ( ? , ? , ? , ? )

        int res = this.userMapper.deleteBatchIds(ids);
        if (res>0){
            System.out.println("批量删除数据成功"+res);
        }
        else {
            System.out.println("批量删除数据失败"+res);
        }
    }

    @Test
    public void test8(){
    long currentPage = 2;
    long pageSize = 2;

        IPage<User> page = new Page<>(currentPage,pageSize);
        page = this.userMapper.selectPage(page,null);
        System.out.println(page);
    }

    @Autowired
    private UserService userService;
@Test
    public void test9(){
        List<User> list = this.userService.list();
        list.forEach(System.out::println);

    }

    @Test
    public void test10(){
        User user = new User();
        user.setId(8L);
        user.setAge(21);
        user.setName("yiyuyu");
        user.setEmail("yiyuyu@fish.com");
        boolean b = userService.save(user);
        if (b){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }

}
