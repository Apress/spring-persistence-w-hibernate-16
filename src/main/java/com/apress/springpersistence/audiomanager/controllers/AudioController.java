package com.apress.springpersistence.audiomanager.controllers;

import com.apress.springpersistence.audiomanager.domain.AudioObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    private


        @RequestMapping("/audio")
        @ResponseBody
        @Transactional(readOnly = true)
        public List<AudioObject> findAllAudio() {


        }

}
