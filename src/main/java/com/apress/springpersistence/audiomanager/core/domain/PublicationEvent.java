package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
public class PublicationEvent extends Event {
    private Boolean free;
    private String publishedOn;
}
