package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

/**
 * Created by pfisher on 3/3/16.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("GENERIC")
public class MediaData extends AbstractPersistable<Long> {


    private byte[] data;

    public MediaData() {
    }

    public MediaData(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


}
