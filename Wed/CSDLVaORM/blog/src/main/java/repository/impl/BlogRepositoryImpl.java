package repository.impl;

import models.Blog;
import org.springframework.stereotype.Repository;
import repository.BlogRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogRepositoryImpl implements BlogRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(int id) {
        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c where c.id=:id", Blog.class);
        return query.setParameter("id", id).getSingleResult();
    }

    @Override
    public void save(Blog blog) {
        entityManager.persist(blog);

    }

    @Override
    public void edit(Blog blog) {
        entityManager.merge(blog);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(findById(id));
    }
}
