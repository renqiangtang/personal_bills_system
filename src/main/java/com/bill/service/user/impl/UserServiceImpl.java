package com.bill.service.user.impl;

import com.bill.common.Constants;
import com.bill.common.Result;
import com.bill.dao.user.UserRepository;
import com.bill.entity.user.User;
import com.bill.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author renqiangtang1
 * @date 2018/7/10
 */
@Service
public class UserServiceImpl implements UserService {
     private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

     @Autowired
     private UserRepository repository;

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @Override
    public Result addUser(User user) {
        logger.info("调用新增用户服务：参数"+user.toString());
        User result  =  repository.save(user);
        return new Result(Constants.REQUEST_SUCCESS,Constants.SUCCESS,result);
    }


    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @Override
    public Result modifyUser(User user) {
        logger.info("调用修改用户服务：参数"+user.toString());
        User result  =  repository.save(user);
        return new Result(Constants.REQUEST_SUCCESS,Constants.SUCCESS,result);
    }

    /**
     * 删除用户
     *
     * @param user
     * @return
     */
    @Override
    public Result deleteUser(User user) {
        logger.info("调用删除用户服务：参数"+user.toString());
        repository.delete(user);
        return Result.success();
    }

    /**
     * 条件查询用户列表
     *
     * @param map
     * @return
     */
    @Override
    public Result findUserByParams(Map<String, Object> map) {
        return null;
    }
}
