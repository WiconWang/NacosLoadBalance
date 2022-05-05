package com.example.common.controller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author sun
 * @Title:
 * @Description:
 * @date 2020-11-1720:46
 */
@FeignClient(value = "user-provider", path = "user")
public interface UserProviderClient {

    @GetMapping
    String list();
}