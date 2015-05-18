package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.*;
import java.net.URL;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Thing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private URL url;
    private URL additionalType;
    private String alternateName;
    @Column(length = 255)
    private String description;

    @org.hibernate.validator.constraints.URL
    private URL image;

    @Column(length=255)
    private String name;
//    private Action potentialAction;
    private URL sameAs;

    @Version
    private Integer version;


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

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
