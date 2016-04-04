package com.apress.springpersistence.audiomanager.core.repository;

import com.apress.springpersistence.audiomanager.core.domain.Category;
import com.apress.springpersistence.audiomanager.core.domain.MediaObject;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long>, QueryDslPredicateExecutor<Category> {

}
