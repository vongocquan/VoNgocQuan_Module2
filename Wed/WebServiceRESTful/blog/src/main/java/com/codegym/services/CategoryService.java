package com.codegym.services;


import com.codegym.models.Blog;
import com.codegym.models.CategoryBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<CategoryBlog> findAll();
    Page<CategoryBlog> findAll(Pageable pageable);
    CategoryBlog findById(int id);
    void save(CategoryBlog categoryBlog);
    void delete(int id);

}
