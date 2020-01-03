package com.yiidian.domain;

import org.hibernate.validator.constraints.Range;
import org.springframework.lang.Nullable;

import javax.validation.constraints.*;

/**
 * 用于接收页面的数据
 * 一点教程网 - www.yiidian.com
 */
public class User {
    private Integer id;
    @NotNull
    @Pattern(regexp = "^([a-zA-Z]*[0-9_-]*$)", message = "只能包含字母、数字、下划线，且不能以数字或下划线开头")
    @Size(min = 8, max = 128)
    private String name;

    @NotNull
    @Range(min=0, max=150,message="年龄不在合法范围内")
    private Integer age;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
