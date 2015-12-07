package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Comment extends CreativeWork {


    @ManyToOne
    private CreativeWork creativeWork;

    private Integer downvoteCount;
    private Integer upvoteCount;


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
