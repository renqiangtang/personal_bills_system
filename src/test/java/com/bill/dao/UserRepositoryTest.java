package com.bill.dao;

import com.bill.dao.user.UserRepository;
import com.bill.entity.user.User;
import com.bill.util.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;


public class UserRepositoryTest extends BaseTest {
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


