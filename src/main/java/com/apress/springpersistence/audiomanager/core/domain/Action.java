package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
public class Action extends Thing {


    private ActionStatusType actionStatus;
    @ManyToOne
    private Person agent;
    private Date endTime;
    @ManyToOne
    private Thing instrument;
    @ManyToOne
    private Place location;
    @ManyToOne
    private Thing object;
    @ManyToOne
    private Person participant;
    @ManyToOne
    private Thing result;
    private Date startTime;
    @ManyToOne
    private EntryPoint target;


    public ActionStatusType getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(ActionStatusType actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Person getAgent() {
        return agent;
    }

    public void setAgent(Person agent) {
        this.agent = agent;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Thing getInstrument() {
        return instrument;
    }

    public void setInstrument(Thing instrument) {
        this.instrument = instrument;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public Thing getObject() {
        return object;
    }

    public void setObject(Thing object) {
        this.object = object;
    }

    public Person getParticipant() {
        return participant;
    }

    public void setParticipant(Person participant) {
        this.participant = participant;
    }

    public Thing getResult() {
        return result;
    }

    public void setResult(Thing result) {
        this.result = result;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public EntryPoint getTarget() {
        return target;
    }

    public void setTarget(EntryPoint target) {
        this.target = target;
    }
}
