package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class AudioObject extends MediaObject {


}
