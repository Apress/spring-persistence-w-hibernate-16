package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
@MappedSuperclass
public class Thing extends AbstractPersistable<Long> {

//    @org.hibernate.validator.constraints.URL
    private URL url;
    private URL additionalType;
    private String alternateName;
    @Column(length = 255)
    private String description;

    @Column(length=255)
    private String name;
//    private Action potentialAction;
//   s
    private URL sameAs;

    @Version
    private Integer version;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate = new Date();
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastmodifiedDate = new Date();


    public URL getAdditionalType() {
        return additionalType;
    }

    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public Action getPotentialAction() {
        return potentialAction;
    }

    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }
*/
    public URL getSameAs() {
        return sameAs;
    }

    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastmodifiedDate() {
        return lastmodifiedDate;
    }

    public void setLastmodifiedDate(Date lastmodifiedDate) {
        this.lastmodifiedDate = lastmodifiedDate;
    }
}
