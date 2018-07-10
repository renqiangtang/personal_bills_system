package com.bill.service.user.impl;

import com.bill.common.Result;
import com.bill.entity.user.User;
import com.bill.service.user.UserService;
import com.bill.util.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;



/**
 * @author renqiangtang1
 * @date 2018/7/10
 */
public class UserServiceImplTest extends BaseTest {
    @Autowired
    private UserService userServiceImpl;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUsername("sky");
        user.setPassword("123123");
        user.setSlat(UUID.randomUUID().toString());
        user.setState(0);
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        Result result = userServiceImpl.addUser(user);
        System.out.printf(result.toString());
    }

    @Test
    public void modifyUser() throws Exception {
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void findUserByParams() throws Exception {
    }

}