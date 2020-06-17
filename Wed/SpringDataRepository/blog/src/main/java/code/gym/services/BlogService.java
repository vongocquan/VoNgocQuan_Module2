package code.gym.services;

import code.gym.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(int id);
    void save(Blog blog);
    void delete(int id);
    Page<Blog> findByTitleContaining(String keyword, Pageable pageable);
}
