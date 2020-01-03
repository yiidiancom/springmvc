package com.yiidian.domain;

import java.util.List;

/**
 * 用于封装表单数据
 * 一点教程网 - www.yiidian.com
 */
public class User {
    private String username;
    private Integer age;

    private List<Address> address;//这里使用List集合接收表单多个地址信息

    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

}
