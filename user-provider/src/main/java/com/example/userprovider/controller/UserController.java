package com.example.userprovider.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author sun
 * @Title:
 * @Description:
 * @date 2020-11-1720:32
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping
    public String list(){
        return "user-provider";
    }
}