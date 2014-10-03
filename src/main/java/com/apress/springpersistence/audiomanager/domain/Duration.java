package com.apress.springpersistence.audiomanager.domain;

import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
public class Duration extends Thing implements Quantity {
    private URL additionalType;
    private String alternateName;
    private String description;
    private URL image;
    private String name;
    private Action potentialAction;
    private URL sameAs;
    private URL url;
}
