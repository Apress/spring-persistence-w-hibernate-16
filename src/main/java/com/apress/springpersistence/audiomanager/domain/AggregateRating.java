package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class AggregateRating extends Rating {

    @PrimaryKeyJoinColumn(name="THING_URL")
    private URL thingUrl;

    @ManyToOne
    private Thing itemReviewed;
    private Integer ratingCount;
    private Integer reviewCount;

    public Thing getItemReviewed() {
        return itemReviewed;
    }

    public void setItemReviewed(Thing itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }
}
