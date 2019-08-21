package com.itheima.controller;

import com.itheima.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 LinBo
 * @创建时间 2019/8/15
 * @描述
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private User user;
    @GetMapping("/user/hello")
    public String sayHello(){
        log.debug("aaaaaaaaaa");
        log.info("aaaaaaaaaa");
        log.warn("aaaaaaaaaa");
        log.error("aaaaaaaaaa");
        return "这是我的第一个springboot项目";
    }
    @GetMapping("/hello/hello")
    public String Hello(){
        log.debug("aaaaaaaaaa");
        log.info("aaaaaaaaaa");
        log.warn("aaaaaaaaaa");
        log.error("aaaaaaaaaa");
        return "这是我的第2个springboot项目";
    }
}
