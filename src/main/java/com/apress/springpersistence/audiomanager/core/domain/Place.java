package com.apress.springpersistence.audiomanager.core.domain;

import com.apress.springpersistence.audiomanager.core.domain.components.GeoCoordinates;
import com.apress.springpersistence.audiomanager.core.domain.components.PostalAddress;

import javax.persistence.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Place extends Thing {

    @Embedded
    private PostalAddress address;

    @ManyToOne
    private Place containedIn;

    @Embedded
    private GeoCoordinates geo;
    private String globalLocationNumber;

    private URL logo;
    @OneToMany
    private Set<Review> reviews = new HashSet<Review>();

    private String telephone;


    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public Place getContainedIn() {
        return containedIn;
    }

    public void setContainedIn(Place containedIn) {
        this.containedIn = containedIn;
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

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public boolean addReview(Review review) {
        return this.getReviews().add(review);
    }

    public URL getLogo() {
        return logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
