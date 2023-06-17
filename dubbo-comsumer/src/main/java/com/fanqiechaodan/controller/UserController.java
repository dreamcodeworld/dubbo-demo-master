package com.fanqiechaodan.controller;

import com.fanqiechaodan.pojo.User;
import com.fanqiechaodan.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanqiechaodan
 * @Classname UserController
 * @Description
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @GetMapping(value = "/get/{id}")
    public User getUser(@PathVariable(value = "id")String id){
        return userService.findById(id);
    }
}
