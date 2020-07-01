package com.codegym.services.impl;

import com.codegym.models.CategoryBlog;
import com.codegym.repository.CategoryRepository;
import com.codegym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryBlog> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<CategoryBlog> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public CategoryBlog findById(int id) {
        return null;
    }

    @Override
    public void save(CategoryBlog categoryBlog) {

    }

    @Override
    public void delete(int id) {

    }
}
