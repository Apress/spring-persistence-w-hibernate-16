package com.apress.springpersistence.audiomanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class CreativeWork extends Thing {
    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url
    @ManyToOne
    private Thing about;
    private String accessibilityAPI;
    private String accessibilityControl;
    private String accessibilityFeature;
    private String accessibilityHazard;
    @ManyToOne
    private Person accountablePerson;
    @ManyToOne
    private AggregateRating aggregateRating;
    private String alternativeHeadline;
    @ManyToOne
    private MediaObject associatedMedia;
//    private Audience audience;
    @ManyToOne
    private AudioObject audio;
    @ManyToOne
    private Person author;
    private String award;
    private String citiation;
    @ManyToOne
    private Comment comment;
    private Integer commentCount;
    @ManyToOne
    private Place contentLocation;
    private String contentRating;
    @ManyToOne
    private Person contributor;
    @ManyToOne
    private Person copyrightHolder;
    private Integer copyrightYear;
    @ManyToOne
    private Person creator;
    private Date dateCreated;
    private Date dateModified;
    private Date datePublished;
    private URL discussionUrl;
    @ManyToOne
    private Person editor;

    private String educationalUse;
    @ManyToOne
    private MediaObject encoding;
    @ManyToOne
    private CreativeWork exampleOfWork;
    private String genre;
    @ManyToOne
    private CreativeWork hasPart;
    private String headline;
    private String inLanguage;
    private String interactionCount;
    private String interactivityType;
    private URL isBasedOnUrl;
    private Boolean isFamilyFriendly;
    @ManyToOne
    private CreativeWork isPartOf;
    private String keywords;
    private String learningResourceType;
    private URL license;
    private Thing mentions;
//    private Offer offers;
    private Integer position;
    @ManyToOne
    private Person provider;
    private Organization publisher; //Organization
    private URL publishingPrinciples;
    private Review review;
    @ManyToOne
    private Organization sourceOrganization;
    private String text;
    private URL thumbnail;
    private Duration timeRequired;
    private String typicalAgeRange;
    private Integer version;
    private URL video;   // VideoObject
    @ManyToOne
    private CreativeWork workingExample;


    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

    public Thing getAbout() {
        return about;
    }

    public void setAbout(Thing about) {
        this.about = about;
    }

    public String getAccessibilityAPI() {
        return accessibilityAPI;
    }

    public void setAccessibilityAPI(String accessibilityAPI) {
        this.accessibilityAPI = accessibilityAPI;
    }

    public String getAccessibilityControl() {
        return accessibilityControl;
    }

    public void setAccessibilityControl(String accessibilityControl) {
        this.accessibilityControl = accessibilityControl;
    }

    public String getAccessibilityFeature() {
        return accessibilityFeature;
    }

    public void setAccessibilityFeature(String accessibilityFeature) {
        this.accessibilityFeature = accessibilityFeature;
    }

    public String getAccessibilityHazard() {
        return accessibilityHazard;
    }

    public void setAccessibilityHazard(String accessibilityHazard) {
        this.accessibilityHazard = accessibilityHazard;
    }

    public Person getAccountablePerson() {
        return accountablePerson;
    }

    public void setAccountablePerson(Person accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }

    public void setAlternativeHeadline(String alternativeHeadline) {
        this.alternativeHeadline = alternativeHeadline;
    }

    public MediaObject getAssociatedMedia() {
        return associatedMedia;
    }

    public void setAssociatedMedia(MediaObject associatedMedia) {
        this.associatedMedia = associatedMedia;
    }

    public AudioObject getAudio() {
        return audio;
    }

    public void setAudio(AudioObject audio) {
        this.audio = audio;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getCitiation() {
        return citiation;
    }

    public void setCitiation(String citiation) {
        this.citiation = citiation;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Place getContentLocation() {
        return contentLocation;
    }

    public void setContentLocation(Place contentLocation) {
        this.contentLocation = contentLocation;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public Person getContributor() {
        return contributor;
    }

    public void setContributor(Person contributor) {
        this.contributor = contributor;
    }

    public Person getCopyrightHolder() {
        return copyrightHolder;
    }

    public void setCopyrightHolder(Person copyrightHolder) {
        this.copyrightHolder = copyrightHolder;
    }

    public Integer getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(Integer copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public URL getDiscussionUrl() {
        return discussionUrl;
    }

    public void setDiscussionUrl(URL discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    public Person getEditor() {
        return editor;
    }

    public void setEditor(Person editor) {
        this.editor = editor;
    }

    public String getEducationalUse() {
        return educationalUse;
    }

    public void setEducationalUse(String educationalUse) {
        this.educationalUse = educationalUse;
    }

    public MediaObject getEncoding() {
        return encoding;
    }

    public void setEncoding(MediaObject encoding) {
        this.encoding = encoding;
    }

    public CreativeWork getExampleOfWork() {
        return exampleOfWork;
    }

    public void setExampleOfWork(CreativeWork exampleOfWork) {
        this.exampleOfWork = exampleOfWork;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public CreativeWork getHasPart() {
        return hasPart;
    }

    public void setHasPart(CreativeWork hasPart) {
        this.hasPart = hasPart;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public String getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(String interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getInteractivityType() {
        return interactivityType;
    }

    public void setInteractivityType(String interactivityType) {
        this.interactivityType = interactivityType;
    }

    public URL getIsBasedOnUrl() {
        return isBasedOnUrl;
    }

    public void setIsBasedOnUrl(URL isBasedOnUrl) {
        this.isBasedOnUrl = isBasedOnUrl;
    }

    public Boolean getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public CreativeWork getIsPartOf() {
        return isPartOf;
    }

    public void setIsPartOf(CreativeWork isPartOf) {
        this.isPartOf = isPartOf;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLearningResourceType() {
        return learningResourceType;
    }

    public void setLearningResourceType(String learningResourceType) {
        this.learningResourceType = learningResourceType;
    }

    public URL getLicense() {
        return license;
    }

    public void setLicense(URL license) {
        this.license = license;
    }

    public Thing getMentions() {
        return mentions;
    }

    public void setMentions(Thing mentions) {
        this.mentions = mentions;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Person getProvider() {
        return provider;
    }

    public void setProvider(Person provider) {
        this.provider = provider;
    }

    public Organization getPublisher() {
        return publisher;
    }

    public void setPublisher(Organization publisher) {
        this.publisher = publisher;
    }

    public URL getPublishingPrinciples() {
        return publishingPrinciples;
    }

    public void setPublishingPrinciples(URL publishingPrinciples) {
        this.publishingPrinciples = publishingPrinciples;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Organization getSourceOrganization() {
        return sourceOrganization;
    }

    public void setSourceOrganization(Organization sourceOrganization) {
        this.sourceOrganization = sourceOrganization;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public URL getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(URL thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Duration getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(Duration timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public void setTypicalAgeRange(String typicalAgeRange) {
        this.typicalAgeRange = typicalAgeRange;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public URL getVideo() {
        return video;
    }

    public void setVideo(URL video) {
        this.video = video;
    }

    public CreativeWork getWorkingExample() {
        return workingExample;
    }

    public void setWorkingExample(CreativeWork workingExample) {
        this.workingExample = workingExample;
    }
}
