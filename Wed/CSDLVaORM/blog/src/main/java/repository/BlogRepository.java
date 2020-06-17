package repository;

import models.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);
}
