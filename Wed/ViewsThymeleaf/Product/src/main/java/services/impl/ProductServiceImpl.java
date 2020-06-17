package services.impl;

import models.Product;
import org.springframework.stereotype.Service;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;
import services.ProductService;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public String save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public String searchReturn(Product product) {
        return productRepository.searchReturn(product);
    }
}
