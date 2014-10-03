package com.apress.springpersistence.audiomanager.dao;

import com.apress.springpersistence.audiomanager.domain.AudioObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pfisher on 10/2/14.
 */
public interface AudioObjectRepository extends CrudRepository<AudioObject, String> {

    public Page<AudioObject> findAll(Pageable pageable);

    public AudioObject save(AudioObject audioObject);

}
