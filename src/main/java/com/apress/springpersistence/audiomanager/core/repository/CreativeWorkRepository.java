package com.apress.springpersistence.audiomanager.core.repository;

import com.apress.springpersistence.audiomanager.core.domain.CreativeWork;
import com.apress.springpersistence.audiomanager.core.domain.Person;
import com.apress.springpersistence.audiomanager.core.domain.Thing;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.net.URL;
import java.util.List;

/**
 * Created by pfisher on 7/14/15.
 */
@Repository
public interface CreativeWorkRepository extends PagingAndSortingRepository<Thing, URL> {

    @EntityGraph(value = "creativeWorkWithCommentsAndText",type = EntityGraph.EntityGraphType.LOAD, attributePaths = {"comments", "text"})
    List<CreativeWork> findByAuthor(Person author);
}
