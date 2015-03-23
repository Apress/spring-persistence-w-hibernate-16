package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Rating extends Thing implements Intangible {


    private Integer bestRating;
    private String ratingValue;
    private Integer worstRating;



    public Integer getBestRating() {
        return bestRating;
    }

    public void setBestRating(Integer bestRating) {
        this.bestRating = bestRating;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Integer getWorstRating() {
        return worstRating;
    }

    public void setWorstRating(Integer worstRating) {
        this.worstRating = worstRating;
    }
}
