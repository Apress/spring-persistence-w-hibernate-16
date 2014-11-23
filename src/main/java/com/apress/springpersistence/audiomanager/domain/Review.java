package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Review extends CreativeWork {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url


    @ManyToOne
    private Thing itemReviewed;
    private String reviewBody;
    @ManyToOne
    private Rating reviewRating;


    @Override
    public URL getThingUrl() {
        return thingUrl;
    }

    @Override
    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

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
