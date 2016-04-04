package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Review extends AbstractPersistable<Long> {

    @ManyToOne
    private CreativeWork itemReviewed;
    private String reviewBody;
    @ManyToOne
    private Rating reviewRating;

    @ManyToOne
    private Person reviewer;


    public CreativeWork getItemReviewed() {
        return itemReviewed;
    }

    public void setItemReviewed(CreativeWork itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public Rating getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(Rating reviewRating) {
        this.reviewRating = reviewRating;
    }

    public Person getReviewer() {
        return reviewer;
    }

    public void setReviewer(Person reviewer) {
        this.reviewer = reviewer;
    }
}
