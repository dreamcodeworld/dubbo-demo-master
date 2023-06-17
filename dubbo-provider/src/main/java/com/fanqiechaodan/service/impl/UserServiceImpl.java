package com.fanqiechaodan.service.impl;

import com.fanqiechaodan.service.UserService;
import com.fanqiechaodan.pojo.User;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author fanqiechaodan
 * @Classname UserServiceImpl
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("番茄炒蛋");
        return user;
    }
}
