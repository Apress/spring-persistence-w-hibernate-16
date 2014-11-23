package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Duration extends Thing implements Quantity {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url


    private URL additionalType;
    private String alternateName;
    private String description;
    private URL image;
    private String name;
    private Action potentialAction;
    private URL sameAs;
    private URL url;            // is this the same as thingUrl?


    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

    @Override
    public URL getAdditionalType() {
        return additionalType;
    }

    @Override
    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    @Override
    public String getAlternateName() {
        return alternateName;
    }

    @Override
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public URL getImage() {
        return image;
    }

    @Override
    public void setImage(URL image) {
        this.image = image;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Action getPotentialAction() {
        return potentialAction;
    }

    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    @Override
    public URL getSameAs() {
        return sameAs;
    }

    @Override
    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public void setUrl(URL url) {
        this.url = url;
    }
}
