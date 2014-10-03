package com.apress.springpersistence.audiomanager.controllers;

import com.apress.springpersistence.audiomanager.dao.AudioObjectRepository;
import com.apress.springpersistence.audiomanager.domain.AudioObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by pfisher on 9/27/14.
 */
@Controller
public class AudioController {

    private AudioObjectRepository audioObjectRepository;

    public AudioObjectRepository getAudioObjectRepository() {
        return audioObjectRepository;
    }

    @Autowired
    public void setAudioObjectRepository(AudioObjectRepository audioObjectRepository) {
        this.audioObjectRepository = audioObjectRepository;
    }

    @RequestMapping("/audio")
    @ResponseBody
    @Transactional(readOnly = true)
    public Page<AudioObject> findAllAudio() {
        Pageable pageable = new PageRequest(0, 10);
        return this.audioObjectRepository.findAll(pageable);

    }

}
