package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class AggregateRating extends Rating {

    @ManyToOne
    private CreativeWork itemReviewed;

    public CreativeWork getItemReviewed() {
        return itemReviewed;
    }

    public void setItemReviewed(CreativeWork itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

}
