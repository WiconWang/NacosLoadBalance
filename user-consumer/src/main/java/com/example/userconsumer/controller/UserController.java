package com.example.userconsumer.controller;
import com.example.common.controller.UserProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sun
 * @Title:
 * @Description:
 * @date 2020-11-1720:32
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    //@Reference( check = false)
    //@Resource
    protected UserProviderClient userProviderClient;

    @RequestMapping("list")
    public String list(){
        return userProviderClient.list();
    }
}