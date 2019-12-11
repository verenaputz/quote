package com.verenaputz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="user")
public class User extends AbstractEntity implements Serializable {

    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @OneToMany(mappedBy = "creator")
    private List<Quote> quotes;

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
