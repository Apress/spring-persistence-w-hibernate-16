package com.apress.springpersistence.audiomanager.domain;

import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
public class Place extends Thing {
    private PostalAddress address;
    private AggregateRating aggregateRating;
    private Place containedIn;
    private Event event;
    private String faxNumber;
    private GeoCoordinates geo;
    private String globalLocationNumber;
    private URL hasMap;
    private String interactionCount;
    private String isIcv4;
    private URL logo;
    private Review review;
    private String telephone;
}
