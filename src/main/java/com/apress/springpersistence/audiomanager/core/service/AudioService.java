package com.apress.springpersistence.audiomanager.core.service;

import com.apress.springpersistence.audiomanager.core.domain.AudioObject;
import com.apress.springpersistence.audiomanager.core.domain.User;
import com.apress.springpersistence.audiomanager.core.exceptions.InvalidAudioFormatException;
import com.apress.springpersistence.audiomanager.core.repository.AudioObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pfisher on 10/2/14.
 */
@Service
public class AudioService {

    private AudioObjectRepository audioObjectRepository;

    public AudioObjectRepository getAudioObjectRepository() {
        return audioObjectRepository;
    }

    @Autowired
    public void setAudioObjectRepository(AudioObjectRepository audioObjectRepository) {
        this.audioObjectRepository = audioObjectRepository;
    }


    @Transactional(rollbackFor=InvalidAudioFormatException.class,
            readOnly=false,
            timeout=30,
            propagation= Propagation.SUPPORTS,
            isolation= Isolation.DEFAULT)
    public void saveAudio(AudioObject entity) throws InvalidAudioFormatException {
        this.getAudioObjectRepository().save(entity);
    }



}
