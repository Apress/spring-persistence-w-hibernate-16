package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.*;
import java.net.URL;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Thing {
    @Id()
    private URL url;
    private URL additionalType;
    private String alternateName;
    private String description;
    private URL image;
    private String name;
//    private Action potentialAction;
    private URL sameAs;


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
}
