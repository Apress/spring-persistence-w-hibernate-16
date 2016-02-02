package com.apress.springpersistence.audiomanager.core.repository;

import com.apress.springpersistence.audiomanager.core.domain.AudioObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pfisher on 10/2/14.
 */
@Repository
public interface AudioObjectRepository extends CrudRepository<AudioObject, String> {

    public Page<AudioObject> findAll(Pageable pageable);

    public AudioObject save(AudioObject audioObject);

}
