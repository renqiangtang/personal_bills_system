package com.bill.service.user;

import com.bill.common.Result;
import com.bill.entity.user.User;

import java.util.Map;

/**
 * Created by sky on 2018/7/9.
 */
public interface UserService {

    /**
     * 新增用户
     * @param user
     * @return
     */
    Result  addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    Result  modifyUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    Result  deleteUser(User user);

    /**
     * 条件查询用户列表
     * @param map
     * @return
     */
    Result  findUserByParams(Map<String,Object> map);

}
