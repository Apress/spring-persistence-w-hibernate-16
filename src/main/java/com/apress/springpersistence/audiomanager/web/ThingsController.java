package com.apress.springpersistence.audiomanager.web;

import com.apress.springpersistence.audiomanager.core.domain.*;
import com.apress.springpersistence.audiomanager.core.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Alternate implementation of Things RestController. The other strategy uses the ThingRepository
 */
@RestController
@RequestMapping("/thingsApi")
public class ThingsController {

    @Autowired
    private ThingRepository thingRepository;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public Page<ThingEntity> findAllMedia(@RequestParam("page") Integer page) {
        Pageable pageable = new PageRequest(page, 10);
        return this.thingRepository.findAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public ThingEntity findThingById(@PathVariable("id") Long id) {
        return this.thingRepository.findOne(id);

    }

    @RequestMapping(value = "/{name}", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public ThingEntity findThingByName(@PathVariable("name") String name) {
        return this.thingRepository.findOne(QThingEntity.thingEntity.name.equalsIgnoreCase(name));
    }

}
