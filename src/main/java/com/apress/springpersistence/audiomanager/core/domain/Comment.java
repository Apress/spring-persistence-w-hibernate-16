package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Comment extends AbstractPersistable<Long> {


    @ManyToOne
    private CreativeWork creativeWork;

    @Basic
    private String content;

    private Integer downvoteCount;
    private Integer upvoteCount;

    @Version
    private Integer version;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CreativeWork getCreativeWork() {
        return creativeWork;
    }

    public void setCreativeWork(CreativeWork creativeWork) {
        this.creativeWork = creativeWork;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public void setDownvoteCount(Integer downvoteCount) {
        this.downvoteCount = downvoteCount;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }


}
