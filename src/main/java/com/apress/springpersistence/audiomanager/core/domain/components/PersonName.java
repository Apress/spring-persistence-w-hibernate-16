package com.apress.springpersistence.audiomanager.core.domain.components;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class PersonName {


    private String firstName;
    private String middleName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return (this.firstName != null ? this.firstName : "") + " " + (this.middleName != null ? this.middleName : "") + " " + (this.lastName != null ? this.lastName : "");
    }

}
