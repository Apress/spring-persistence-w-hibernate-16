package com.apress.springpersistence.audiomanager.web;

import com.apress.springpersistence.audiomanager.core.domain.*;
import com.apress.springpersistence.audiomanager.core.repository.CategoryRepository;
import com.apress.springpersistence.audiomanager.core.repository.MediaObjectRepository;
import com.apress.springpersistence.audiomanager.core.service.MediaService;
import com.sun.media.jfxmedia.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pfisher on 9/27/14.
 */
@RestController
@RequestMapping("/mediaObjects")
public class AudioController {

    @Autowired
    private MediaObjectRepository mediaObjectRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MediaService mediaService;

    public MediaObjectRepository getMediaObjectRepository() {
        return mediaObjectRepository;
    }



    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public Page<MediaObject> findAllMedia(@RequestParam("page") Integer page) {
        Pageable pageable = new PageRequest(page, 10);
        return this.mediaObjectRepository.findAll(pageable);

    }

    @RequestMapping(value = "/", method = {RequestMethod.POST})
    @ResponseBody
    public MediaObject saveMedia(@RequestBody MediaObject mediaObject) {
        return this.mediaService.saveMedia(mediaObject);
    }

    @RequestMapping(value = "/category/{category}", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public Page<MediaObject> findAllMediaWIthinCategory(@RequestParam("page") Integer page, @PathVariable String categoryName) {
        Pageable pageable = new PageRequest(page, 10);
        Category category = categoryRepository.findOne(QCategory.category.name.equalsIgnoreCase(categoryName));
        return this.mediaObjectRepository.findAll(QMediaObject.mediaObject.categories.contains(category), pageable);
    }


    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public MediaObject findMediaById(@PathVariable("id") Long id) {
        return this.mediaObjectRepository.findOne(id);

    }

    @RequestMapping(value = "/{name}", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public MediaObject findMediaByName(@PathVariable("name") String name) {
        return this.mediaObjectRepository.findOne(QMediaObject.mediaObject.name.equalsIgnoreCase(name));
    }


}
