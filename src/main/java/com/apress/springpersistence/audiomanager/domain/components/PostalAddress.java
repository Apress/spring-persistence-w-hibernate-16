package com.apress.springpersistence.audiomanager.domain.components;

import com.apress.springpersistence.audiomanager.domain.Intangible;
import com.apress.springpersistence.audiomanager.domain.Thing;

import javax.persistence.Embeddable;

/**
 * Created by pfisher on 10/1/14.
 */
@Embeddable
public class PostalAddress extends Thing implements Intangible {
    private String addressCountry;
    private String addressLocality;
    private String addressRegion;
    private String postOfficeBoxNumber;
    private String postalCode;
    private String streetAddress;

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
        this.postOfficeBoxNumber = postOfficeBoxNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
