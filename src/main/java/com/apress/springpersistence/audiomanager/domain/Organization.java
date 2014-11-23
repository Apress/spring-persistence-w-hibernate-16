package com.apress.springpersistence.audiomanager.domain;

import com.apress.springpersistence.audiomanager.domain.components.PostalAddress;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Organization extends Thing {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url


    @Embedded
    private PostalAddress address;
    @ManyToOne
    private AggregateRating aggregateRating;
    @ManyToOne
    private Organization brand;
    @ManyToOne
    private Organization department;
    private Date dissolutionDate;
    private String duns;
    private String email;
    @ManyToOne
    private Person employee;
    @ManyToOne
    private Event event;
    private String faxNumber;
    @ManyToOne
    private Person founder;
    private Date foundingDate;
    private String globalLocationNumber;
    @ManyToOne
    private Place hasPOS;
    private String interactionCount;
    private String isIcv4;
    private String legalName;
    @ManyToOne
    private Place location;
    private URL logo;
    @ManyToOne
    private Person member;
    @ManyToOne
    private Organization memberOf;
    private String naics;
    @ManyToOne
    private Organization subOrganization;
    private String taxID;
    private String telephone;
    private String vatID;

    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Organization getBrand() {
        return brand;
    }

    public void setBrand(Organization brand) {
        this.brand = brand;
    }

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public Date getDissolutionDate() {
        return dissolutionDate;
    }

    public void setDissolutionDate(Date dissolutionDate) {
        this.dissolutionDate = dissolutionDate;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Person getFounder() {
        return founder;
    }

    public void setFounder(Person founder) {
        this.founder = founder;
    }

    public Date getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(Date foundingDate) {
        this.foundingDate = foundingDate;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public Place getHasPOS() {
        return hasPOS;
    }

    public void setHasPOS(Place hasPOS) {
        this.hasPOS = hasPOS;
    }

    public String getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(String interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getIsIcv4() {
        return isIcv4;
    }

    public void setIsIcv4(String isIcv4) {
        this.isIcv4 = isIcv4;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public URL getLogo() {
        return logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }

    public Person getMember() {
        return member;
    }

    public void setMember(Person member) {
        this.member = member;
    }

    public Organization getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(Organization memberOf) {
        this.memberOf = memberOf;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public Organization getSubOrganization() {
        return subOrganization;
    }

    public void setSubOrganization(Organization subOrganization) {
        this.subOrganization = subOrganization;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVatID() {
        return vatID;
    }

    public void setVatID(String vatID) {
        this.vatID = vatID;
    }
}
