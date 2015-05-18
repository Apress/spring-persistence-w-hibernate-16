package com.apress.springpersistence.audiomanager.core.domain;

import com.apress.springpersistence.audiomanager.core.domain.components.PersonName;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.Optional;

/**
 * Created by pfisher on 9/30/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person extends Thing {


    @Embedded
    private PersonName personName;

    @Email
    private String email;
    private String gender;
    private String telephone;

    @Transient
    public Optional<String> getGivenName() {
        return Optional.ofNullable(this.personName.getFirstName());
    }

    @Transient
    public Optional<String> getAdditionalName() {
        return Optional.ofNullable(this.personName.getLastName());
    }




    public PersonName getFullName() {
        return personName;
    }

    public void setFullName(PersonName name) {
        this.personName = name;
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
