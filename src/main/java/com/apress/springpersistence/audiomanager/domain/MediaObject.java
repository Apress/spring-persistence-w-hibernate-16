package com.apress.springpersistence.audiomanager.domain;

import com.apress.springpersistence.audiomanager.domain.components.QuantitativeValue;

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
    private String bitRate;
    private String contentSize;
    private URL contentUrl;
    @ManyToOne
    private Duration duration;
    private URL embedUrl;
    @ManyToOne
    private CreativeWork encodesCreativeWork;
    private String encodingFormat;
    private Date expires;
    private Integer height;
    private String interactionCount;
//    private Offer offers;
    private String playerType;
    @ManyToOne
    private Organization productionCompany;
    @ManyToOne
    private PublicationEvent publication;
    @ManyToOne
    private Place regionsAllowed;
    private Boolean requiresSubscription;
    private Date uploadDate;
    private Integer width;


    public String getBitRate() {
        return bitRate;
    }

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    public String getContentSize() {
        return contentSize;
    }

    public void setContentSize(String contentSize) {
        this.contentSize = contentSize;
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

    public CreativeWork getEncodesCreativeWork() {
        return encodesCreativeWork;
    }

    public void setEncodesCreativeWork(CreativeWork encodesCreativeWork) {
        this.encodesCreativeWork = encodesCreativeWork;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(String interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
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

    public Place getRegionsAllowed() {
        return regionsAllowed;
    }

    public void setRegionsAllowed(Place regionsAllowed) {
        this.regionsAllowed = regionsAllowed;
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
