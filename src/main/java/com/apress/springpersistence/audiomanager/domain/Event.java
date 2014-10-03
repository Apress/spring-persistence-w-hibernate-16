package com.apress.springpersistence.audiomanager.domain;

import java.util.Date;

/**
 * Created by pfisher on 10/1/14.
 */
public class Event extends Thing {
    private Person attendee;
    private Date doorTime;
    private Duration duration;
    private Date endDate;
    private EventStatusType eventStatus;
    private Place location;
    private Person organizer;
    private Person performer;
    private Date previousStartDate;
    private Date startDate;
    private Event subEvent;
    private Event superEvent;
    private String typicalAgeRange;
    private CreativeWork workPerformed;
}
