package com.apress.springpersistence.audiomanager.domain.components;

import com.apress.springpersistence.audiomanager.domain.StructuredValue;
import com.apress.springpersistence.audiomanager.domain.Thing;

import javax.persistence.Embeddable;

/**
 * Created by pfisher on 10/1/14.
 */
@Embeddable
public class GeoCoordinates extends Thing implements StructuredValue {
    private Double elevation;
    private Double latitude;
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
