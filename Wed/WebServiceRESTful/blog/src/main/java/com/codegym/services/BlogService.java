package com.codegym.services;


import com.codegym.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);
    Blog findById(int id);
    void save(Blog blog);
    void delete(int id);
    Page<Blog> findByTitleContaining(String keyword, Pageable pageable);
    List<Blog> findAllByCategoryBlog_Id(int id);
}
