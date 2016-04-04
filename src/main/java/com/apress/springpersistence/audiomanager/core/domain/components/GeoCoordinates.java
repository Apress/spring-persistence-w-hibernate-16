package com.apress.springpersistence.audiomanager.core.domain.components;

import com.apress.springpersistence.audiomanager.core.domain.StructuredValue;
import com.apress.springpersistence.audiomanager.core.domain.Thing;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pfisher on 10/1/14.
 */
@Embeddable
public class GeoCoordinates implements StructuredValue {



    private Double elevation;
    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
