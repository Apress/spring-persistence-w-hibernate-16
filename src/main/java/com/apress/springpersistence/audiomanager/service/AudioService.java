package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.dao.AudioObjectRepository;
import org.springframework.stereotype.Service;

/**
 * Created by pfisher on 10/2/14.
 */
@Service
public class AudioService {

    private AudioObjectRepository audioObjectRepository;


    @
    public AudioObjectRepository getAudioObjectRepository() {
        return audioObjectRepository;
    }

    public void setAudioObjectRepository(AudioObjectRepository audioObjectRepository) {
        this.audioObjectRepository = audioObjectRepository;
    }
}
