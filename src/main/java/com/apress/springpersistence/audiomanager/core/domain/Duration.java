package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.annotation.Version;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.AbstractPersistable_;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Duration extends AbstractPersistable<Long> implements Quantity {

   /* @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url

*/
    private Long time;

    @Version
    private Integer version;

/*    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }*/


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
