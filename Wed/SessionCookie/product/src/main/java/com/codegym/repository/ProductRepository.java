package com.codegym.repository;

import com.codegym.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(String code);
}
