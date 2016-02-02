package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.annotation.Version;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
public class Rating extends AbstractPersistable<Long> implements Intangible {

    private String ratingValue;

    @Version
    private Integer version;



    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
