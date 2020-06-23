package com.codegym.repository.impl;

import com.codegym.models.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    public static Map<String, Product> products = new HashMap<>();
    static {
        products.put("0001", new Product("0001", "hoa hồng", 350000, "Dù trời nắng hay mưa, dù xa hay gần, chúng tôi luôn phục vụ khách hàng nhiệt tình và chu đáo 24/7", 50, "/img/hoahong.jpg"));
        products.put("0002", new Product("0002", "hoa bady", 400000, "Dù trời nắng hay mưa, dù xa hay gần, chúng tôi luôn phục vụ khách hàng nhiệt tình và chu đáo 24/7", 50, "/img/hoabady.jpg"));
     }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values()) ;
    }

    @Override
    public Product findById(String code) {
        return products.get(code);
    }
}
