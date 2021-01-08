package com.mengxuegu.springcloud.entities;

import java.io.Serializable;

public class Student2 implements Serializable {

    private String name;

    private String age;
    
    private String test;
    
    private String test1;
    
    private String test3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
