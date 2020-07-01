package com.codegym.repository;


import com.codegym.models.Blog;
import com.codegym.models.CategoryBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryBlog, Integer> {
}
