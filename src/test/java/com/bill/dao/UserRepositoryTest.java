package com.bill.dao;

import com.bill.PersonalBillsSystemApplication;
import com.bill.entity.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonalBillsSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("amdin");
        user.setPassword("admin");
        user.setSlat(UUID.randomUUID().toString());
        user.setState(0);
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        User user1 = userRepository.save(user);
    }
}


