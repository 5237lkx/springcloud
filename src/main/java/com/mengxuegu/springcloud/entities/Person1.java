package com.mengxuegu.springcloud.entities;

public class Person1 {

    private String name;

    private Integer age;

    private String testBranch;

    private String lkx1;

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

    public String getTestBranch() {
        return testBranch;
    }

    public void setTestBranch(String testBranch) {
        this.testBranch = testBranch;
    }

    //


    public String getLkx1() {
        return lkx1;
    }

    public void setLkx1(String lkx1) {
        this.lkx1 = lkx1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", testBranch='" + testBranch + '\'' +
                '}';
    }
}
