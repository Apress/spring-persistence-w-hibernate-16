package com.apress.springpersistence.audiomanager.domain;

import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
public class CreativeWork extends Thing {
    private Thing about;
    private String accessibilityAPI;
    private String accessibilityControl;
    private String accessibilityFeature;
    private String accessibilityHazard;
    private Person accountablePerson;
    private AggregateRating aggregateRating;
    private String alternativeHeadline;
    private MediaObject associatedMedia;
    private Audience audience;
    private AudioObject audio;
    private Person author;
    private String award;
    private String citiation;
    private Comment comment;
    private Integer commentCount;
    private Place contentLocation;
    private String contentRating;
    private Person contributor;
    private Person copyrightHolder;
    private Integer copyrightYear;
    private Person creator;
    private Date dateCreated;
    private Date dateModified;
    private Date datePublished;
    private URL discussionUrl;
    private Person editor;

    private String educationalUse;
    private MediaObject encoding;
    private CreativeWork exampleOfWork;
    private String genre;
    private CreativeWork hasPart;
    private String headline;
    private String inLanguage;
    private String interactionCount;
    private String interactivityType;
    private URL isBasedOnUrl;
    private Boolean isFamilyFriendly;
    private CreativeWork isPartOf;
    private String keywords;
    private String learningResourceType;
    private URL license;
    private Thing mentions;
//    private Offer offers;
    private Integer position;
    private Person provider;
    private Organization publisher; //Organization
    private URL publishingPrinciples;
    private Review review;
    private Organization sourceOrganization;
    private String text;
    private URL thumbnail;
    private Duration timeRequired;
    private String typicalAgeRange;
    private Integer version;
    private URL video;   // VideoObject
    private CreativeWork workingExample;


}
