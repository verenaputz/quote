package com.verenaputz.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AbstractEntity {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="modified_time")
    private Date modifiedTime;

    public AbstractEntity(){

    }

    public AbstractEntity(long id, Date createTime, Date modifiedTime) {
        this.id = id;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }


}
