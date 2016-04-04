package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class MediaObject extends CreativeWork {

//    private NewsArticle associatedArticle;
    private URL contentUrl;
    @ManyToOne
    private Duration duration;
    private URL embedUrl;

    private String encodingFormat;
    private Integer width;
    private Integer height;
//    private Offer offers;
    @ManyToOne
    private Organization productionCompany;
    @ManyToOne
    private PublicationEvent publication;

    private Boolean requiresSubscription;
    private Date uploadDate;

    @Basic(fetch = FetchType.EAGER)
    @Lob
    private byte[] mediaContent;

    private String transcript;

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public URL getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(URL contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public URL getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(URL embedUrl) {
        this.embedUrl = embedUrl;
    }



    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Organization getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(Organization productionCompany) {
        this.productionCompany = productionCompany;
    }

    public PublicationEvent getPublication() {
        return publication;
    }

    public void setPublication(PublicationEvent publication) {
        this.publication = publication;
    }

    public Boolean getRequiresSubscription() {
        return requiresSubscription;
    }

    public void setRequiresSubscription(Boolean requiresSubscription) {
        this.requiresSubscription = requiresSubscription;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
