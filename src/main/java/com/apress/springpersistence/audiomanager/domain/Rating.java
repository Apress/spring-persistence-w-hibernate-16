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
public class Rating extends Thing implements Intangible {
    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl;

    private Integer bestRating;
    private String ratingValue;
    private Integer worstRating;
}
