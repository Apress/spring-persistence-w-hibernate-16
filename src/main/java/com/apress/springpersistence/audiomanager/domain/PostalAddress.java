package com.apress.springpersistence.audiomanager.domain;

/**
 * Created by pfisher on 10/1/14.
 */
public class PostalAddress extends Thing implements Intangible {
    private String addressCountry;
    private String addressLocality;
    private String addressRegion;
    private String postOfficeBoxNumber;
    private String postalCode;
    private String streetAddress;
}
