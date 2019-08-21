package com.itheima.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @创建人 LinBo
 * @创建时间 2019/8/15
 * @描述
 */
@ConfigurationProperties(prefix = "user")//标志位配置文件
@Component//放到spring容器里面
public class User {
    private String username;
    private int age;
    private List<String>girls;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getGirls() {
        return girls;
    }

    public void setGirls(List<String> girls) {
        this.girls = girls;
    }
}
