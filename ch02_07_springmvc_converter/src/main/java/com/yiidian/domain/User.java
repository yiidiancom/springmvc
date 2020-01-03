package com.yiidian.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用于封装表单数据
 * 一点教程网 - www.yiidian.com
 */
public class User {
    private String username;
    private Date birthday;//这里接收的是java.util.Date类型

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
