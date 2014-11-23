package com.apress.springpersistence.audiomanager.domain;

import com.apress.springpersistence.audiomanager.domain.components.PersonName;

import javax.persistence.*;
import java.net.URL;
import java.util.Optional;

/**
 * Created by pfisher on 9/30/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Person extends Thing {


    @Embedded
    private PersonName name;


    private String email;
    private String gender;
    private String telephone;

    public Optional<String> getGivenName() {
        return Optional.ofNullable(this.name.getFirstName());
    }

    public Optional<String> getAdditionalName() {
        return Optional.ofNullable(this.name.getLastName());
    }




    public PersonName getFullName() {
        return name;
    }

    public void setFullName(PersonName name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
