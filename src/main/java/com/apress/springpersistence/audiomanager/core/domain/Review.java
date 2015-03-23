package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Review extends CreativeWork {

    @ManyToOne
    private Thing itemReviewed;
    private String reviewBody;
    @ManyToOne
    private Rating reviewRating;




    public Thing getItemReviewed() {
        return itemReviewed;
    }

    public void setItemReviewed(Thing itemReviewed) {
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
}
