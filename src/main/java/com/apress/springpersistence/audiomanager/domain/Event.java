package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Event extends Thing {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url

    @ManyToOne
    private Person attendee;
    private Date doorTime;
    private Duration duration;
    private Date endDate;
    private EventStatusType eventStatus;
    @ManyToOne
    private Place location;
    @ManyToOne
    private Person organizer;
    @ManyToOne
    private Person performer;
    private Date previousStartDate;
    private Date startDate;
    @ManyToOne
    private Event subEvent;
    @ManyToOne
    private Event superEvent;
    private String typicalAgeRange;
    @ManyToOne
    private CreativeWork workPerformed;

    public Person getAttendee() {
        return attendee;
    }

    public void setAttendee(Person attendee) {
        this.attendee = attendee;
    }

    public Date getDoorTime() {
        return doorTime;
    }

    public void setDoorTime(Date doorTime) {
        this.doorTime = doorTime;
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

    public Person getPerformer() {
        return performer;
    }

    public void setPerformer(Person performer) {
        this.performer = performer;
    }

    public Date getPreviousStartDate() {
        return previousStartDate;
    }

    public void setPreviousStartDate(Date previousStartDate) {
        this.previousStartDate = previousStartDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Event getSubEvent() {
        return subEvent;
    }

    public void setSubEvent(Event subEvent) {
        this.subEvent = subEvent;
    }

    public Event getSuperEvent() {
        return superEvent;
    }

    public void setSuperEvent(Event superEvent) {
        this.superEvent = superEvent;
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public void setTypicalAgeRange(String typicalAgeRange) {
        this.typicalAgeRange = typicalAgeRange;
    }

    public CreativeWork getWorkPerformed() {
        return workPerformed;
    }

    public void setWorkPerformed(CreativeWork workPerformed) {
        this.workPerformed = workPerformed;
    }
}
