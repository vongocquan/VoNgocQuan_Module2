package com.codegym.repository;


import com.codegym.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByTitleContaining(String keyword, Pageable pageable);
    List<Blog> findAllByCategoryBlog_Id(int id);
}
