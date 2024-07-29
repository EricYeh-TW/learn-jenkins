package idv.eric.mapper;

import idv.eric.demo.DemoApplication;
import idv.eric.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = DemoApplication.class)
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllTest() {
        List<Users> all = userMapper.findAll();

        for (Users user : all) {
            System.out.println("USER: " + user);
        }
    }

    @Test
    public void findByNameTest() {
        Users user = userMapper.findByName("test1");

        System.out.println("USER: " + user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void insertTest() {
        userMapper.insert("test4", "F130052888", LocalDate.now(), "test4@gmail.com");

        List<Users> all = userMapper.findAll();

        for (Users user : all) {
            System.out.println("USER: " + user);
        }
    }
}