package com.fzt.bootdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class User {
    private String name;
    private String sex;

    @Max(130)
    @Min(value = 18,message = "未成年")
    private Integer age;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
