package com.verenaputz.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="quote")
public class Quote extends AbstractEntity implements Serializable {

    @Column(name="zitat")
    private String zitat;
    @JoinColumn(name="creator_id")
    @ManyToOne
    private User creator;
    @Column(name="author")
    private String author;

    public Quote(){

    }

    public Quote(long id, Date createTime, Date modifiedTime, String zitat, User creator, String author) {
        super(id, createTime, modifiedTime);
        this.zitat = zitat;
        this.creator = creator;
        this.author = author;
    }

    public String getZitat() {
        return zitat;
    }

    public void setZitat(String zitat) {
        this.zitat = zitat;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }


}
