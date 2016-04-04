package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by pfisher on 3/23/16.
 */
@Entity
@DiscriminatorValue("HIGH")
public class MediaDataHigh  extends MediaData {
    public MediaDataHigh(byte[] data) {
        this.setData(data);
    }

    public MediaDataHigh() {

    }
}
