package com.codegym.services.impl;


import com.codegym.models.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByTitleContaining(String keyword, Pageable pageable) {
        return blogRepository.findByTitleContaining(keyword, pageable);
    }

    @Override
    public List<Blog> findAllByCategoryBlog_Id(int id) {
        return blogRepository.findAllByCategoryBlog_Id(id);
    }

}
