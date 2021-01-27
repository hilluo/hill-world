package com.hill.mall.entity;

public class User {
    public User() {
    }

    public User(int id, String name, String account, String password, int age) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.age = age;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private  String account;
    private  String password;
    private  int age;





}
