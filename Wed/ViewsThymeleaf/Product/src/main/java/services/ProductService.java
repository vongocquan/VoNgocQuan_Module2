package services;

import models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    String save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);
    Product search(String name);
    String searchReturn(Product product);
}
