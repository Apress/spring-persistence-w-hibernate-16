package com.apress.springpersistence.audiomanager.core.service.impl;

import com.apress.springpersistence.audiomanager.core.domain.AudioObject;
import com.apress.springpersistence.audiomanager.core.domain.MediaObject;
import com.apress.springpersistence.audiomanager.core.exceptions.InvalidAudioFormatException;
import com.apress.springpersistence.audiomanager.core.repository.MediaObjectRepository;
import com.apress.springpersistence.audiomanager.core.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pfisher on 10/2/14.
 */
@Service
public class MediaServiceImpl implements MediaService {

    private MediaObjectRepository mediaObjectRepository;

    public MediaObjectRepository getMediaObjectRepository() {
        return mediaObjectRepository;
    }

    @Autowired
    public void setMediaObjectRepository(MediaObjectRepository mediaObjectRepository) {
        this.mediaObjectRepository = mediaObjectRepository;
    }


    @Transactional(rollbackFor=InvalidAudioFormatException.class,
            readOnly=false,
            timeout=30,
            propagation= Propagation.SUPPORTS,
            isolation= Isolation.DEFAULT)
    public MediaObject saveMedia(MediaObject entity) throws InvalidAudioFormatException {
        return this.getMediaObjectRepository().save(entity);
    }



}
