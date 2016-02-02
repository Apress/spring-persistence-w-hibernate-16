package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Event extends Thing {

    @ManyToOne
    private Person attendee;
    @ManyToOne
    private Duration duration;

    private Date startDate;
    private Date endDate;
    private EventStatusType eventStatus;
    @ManyToOne
    private Place location;
    @ManyToOne
    private Person organizer;


    @ManyToOne
    private CreativeWork workPerformed;

    public Person getAttendee() {
        return attendee;
    }

    public void setAttendee(Person attendee) {
        this.attendee = attendee;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public EventStatusType getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusType eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public CreativeWork getWorkPerformed() {
        return workPerformed;
    }

    public void setWorkPerformed(CreativeWork workPerformed) {
        this.workPerformed = workPerformed;
    }
}
