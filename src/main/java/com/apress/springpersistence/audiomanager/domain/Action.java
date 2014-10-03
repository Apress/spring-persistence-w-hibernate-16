package com.apress.springpersistence.audiomanager.domain;

import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
public class Action extends Thing {
    private ActionStatusType actionStatus;
    private Person agent;
    private Date endTime;
    private Thing instrument;
    private Place location;
    private Thing object;
    private Person participant;
    private Thing result;
    private Date startTime;
    private EntryPoint target;

}
