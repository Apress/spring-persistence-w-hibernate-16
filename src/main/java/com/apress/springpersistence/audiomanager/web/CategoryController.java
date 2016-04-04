package com.apress.springpersistence.audiomanager.web;

import com.apress.springpersistence.audiomanager.core.domain.Category;
import com.apress.springpersistence.audiomanager.core.domain.MediaObject;
import com.apress.springpersistence.audiomanager.core.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;


    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    @Transactional(readOnly = true)
    public Iterable<Category> findAllCategories() {
        return this.categoryRepository.findAll();

    }

    @RequestMapping(value = "/", method = {RequestMethod.POST})
    @ResponseBody
    @Transactional()
    public Category saveCategory(@RequestBody Category category) {
        return this.categoryRepository.save(category);
    }


}
