package com.verenaputz.model;

import java.util.Date;

public class User extends AbstractEntity{

    private String name;
    private String password;

    public User (){

    }

    public User(long id, Date createTime, Date modifiedTime, String name, String password) {
        super(id, createTime, modifiedTime);
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
