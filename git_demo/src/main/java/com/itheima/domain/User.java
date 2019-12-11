package com.itheima.domain;

public class User {
    private String name;
    private Integer id;
    private String sex;
    private Integer age;

    public User(String name, Integer id, String sex, Integer age) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
