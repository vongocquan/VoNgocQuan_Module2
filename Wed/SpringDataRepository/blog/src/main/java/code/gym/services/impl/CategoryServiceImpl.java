package code.gym.services.impl;

import code.gym.models.CategoryBlog;
import code.gym.repository.CategoryRepository;
import code.gym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Page<CategoryBlog> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public CategoryBlog findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CategoryBlog categoryBlog) {
        categoryRepository.save(categoryBlog);
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
