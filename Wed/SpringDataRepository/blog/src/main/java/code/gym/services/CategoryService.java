package code.gym.services;

import code.gym.models.Blog;
import code.gym.models.CategoryBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<CategoryBlog> findAll(Pageable pageable);
    CategoryBlog findById(int id);
    void save(CategoryBlog categoryBlog);
    void delete(int id);
}
