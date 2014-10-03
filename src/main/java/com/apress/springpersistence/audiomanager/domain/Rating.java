package com.apress.springpersistence.audiomanager.domain;

/**
 * Created by pfisher on 10/1/14.
 */
public class Rating extends Thing implements Intangible {
    private Integer bestRating;
    private String ratingValue;
    private Integer worstRating;
}
