package com.apress.springpersistence.audiomanager.core.repository;

import com.apress.springpersistence.audiomanager.core.domain.AudioObject;
import com.apress.springpersistence.audiomanager.core.domain.MediaObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MediaObjectRepository extends CrudRepository<MediaObject, Long>, QueryDslPredicateExecutor<MediaObject> {

    public Page<MediaObject> findAll(Pageable pageable);

    public MediaObject save(MediaObject audioObject);

}
