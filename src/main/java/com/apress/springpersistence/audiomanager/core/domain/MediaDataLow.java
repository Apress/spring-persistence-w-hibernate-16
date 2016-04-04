package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by pfisher on 3/3/16.
 */

@Entity
@DiscriminatorValue("LOW")
public class MediaDataLow extends MediaData {

    public MediaDataLow(byte[] data) {
        this.setData(data);
    }

    public MediaDataLow() {
    }

}
