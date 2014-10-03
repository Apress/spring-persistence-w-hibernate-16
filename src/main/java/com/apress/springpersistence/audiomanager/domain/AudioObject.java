package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Entity;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
public class AudioObject extends Thing /*MediaObject */ {
    private String transcript;
}
