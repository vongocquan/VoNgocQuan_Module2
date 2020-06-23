package com.codegym.services.impl;

import com.codegym.models.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String code) {
        return productRepository.findById(code);
    }

    @Override
    public void delete(List<Product> list, String codeProduct) {
        list.remove(findById(codeProduct));
    }


}
