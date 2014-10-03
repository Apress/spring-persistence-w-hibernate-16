package com.apress.springpersistence.audiomanager.domain;

import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 10/1/14.
 */
public class Organization extends Thing {
    private PostalAddress address;
    private AggregateRating aggregateRating;
    private Organization brand;
    private Organization department;
    private Date dissolutionDate;
    private String duns;
    private String email;
    private Person employee;
    private Event event;
    private String faxNumber;
    private Person founder;
    private Date foundingDate;
    private String globalLocationNumber;
    private Place hasPOS;
    private String interactionCount;
    private String isIcv4;
    private String legalName;
    private Place location;
    private URL logo;
    private Person member;
    private Organization memberOf;
    private String naics;
    private Organization subOrganization;
    private String taxID;
    private String telephone;
    private String vatID;

}
