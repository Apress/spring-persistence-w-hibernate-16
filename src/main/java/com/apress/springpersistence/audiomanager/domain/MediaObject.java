package com.apress.springpersistence.audiomanager.domain;

import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
public class MediaObject extends CreativeWork {
//    private NewsArticle associatedArticle;
    private String bitRate;
    private String contentSize;
    private URL contentUrl;
    private Duration duration;
    private URL embedUrl;
    private CreativeWork encodesCreativeWork;
    private String encodingFormat;
    private Date expires;
    private QuantitativeValue height;
    private String interactionCount;
//    private Offer offers;
    private String playerType;
    private Organization productionCompany;
    private PublicationEvent publication;
    private Place regionsAllowed;
    private Boolean requiresSubscription;
    private Date uploadDate;
    private QuantitativeValue width;

}
