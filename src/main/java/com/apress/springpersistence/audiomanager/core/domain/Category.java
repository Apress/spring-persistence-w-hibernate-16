package com.apress.springpersistence.audiomanager.core.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category extends Thing {

    @ManyToMany
    private Set<CreativeWork> creativeWorks = new HashSet<CreativeWork>();

    private boolean addCreativeWork(CreativeWork creativeWork) {
        creativeWork.getCategories().add(this);
        return this.creativeWorks.add(creativeWork);
    }

    public Set<CreativeWork> getCreativeWorks() {
        return creativeWorks;
    }

    public void setCreativeWorks(Set<CreativeWork> creativeWorks) {
        this.creativeWorks = creativeWorks;
    }
}
