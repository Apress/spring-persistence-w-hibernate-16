package com.apress.springpersistence.audiomanager.core.domain;

import com.apress.springpersistence.audiomanager.core.domain.components.GeoCoordinates;
import com.apress.springpersistence.audiomanager.core.domain.components.PostalAddress;

import javax.persistence.*;
import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Place extends Thing {


    @Embedded
    private PostalAddress address;
    @ManyToOne
    private AggregateRating aggregateRating;
    @ManyToOne
    private Place containedIn;
    @ManyToOne
    private Event event;

    @Embedded
    private GeoCoordinates geo;
    private String globalLocationNumber;

    private String isIcv4;
    private URL logo;
    @ManyToOne
    private Review review;

    private String telephone;


    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Place getContainedIn() {
        return containedIn;
    }

    public void setContainedIn(Place containedIn) {
        this.containedIn = containedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


    public GeoCoordinates getGeo() {
        return geo;
    }

    public void setGeo(GeoCoordinates geo) {
        this.geo = geo;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }



    public String getIsIcv4() {
        return isIcv4;
    }

    public void setIsIcv4(String isIcv4) {
        this.isIcv4 = isIcv4;
    }

    public URL getLogo() {
        return logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
