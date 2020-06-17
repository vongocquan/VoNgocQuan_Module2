package services;

import models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);
}
