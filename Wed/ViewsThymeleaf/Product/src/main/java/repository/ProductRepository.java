package repository;

import models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository {
    List<Product> findAll();
    String save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    Product search(String name);
    String searchReturn(Product product);
}
