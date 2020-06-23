package com.codegym.services;

import com.codegym.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(String code);
    void delete(List<Product> list, String codeProduct);
}
