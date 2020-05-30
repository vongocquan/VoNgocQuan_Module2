package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    public static Map<Integer, Product> products;
    private ProductServiceImpl productService;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Nokia 7.2", "4590000đ", "dsf", "Nokia"));
        products.put(2, new Product(2, "OPPO A5", "4.790.000đ", "dsda", "OPPO"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product search(List<Product> productList, String name) {
        Product product = new Product();
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getName().equals(name)){
                product = productList.get(i);
            }
        }
        return product;
    }
}
