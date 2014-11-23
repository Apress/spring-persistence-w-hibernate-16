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
public class EntryPoint extends Thing implements Intangible {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url

    private String application;
    private String contentType;
    private String encodingType;
    private String httpMethod;
    private String urlTemplate;

    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getUrlTemplate() {
        return urlTemplate;
    }

    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }
}
