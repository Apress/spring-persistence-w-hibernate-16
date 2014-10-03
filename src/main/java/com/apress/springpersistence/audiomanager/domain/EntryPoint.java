package com.apress.springpersistence.audiomanager.domain;

/**
 * Created by pfisher on 10/1/14.
 */
public class EntryPoint extends Thing implements Intangible {
    private String application;
    private String contentType;
    private String encodingType;
    private String httpMethod;
    private String urlTemplate;
}
