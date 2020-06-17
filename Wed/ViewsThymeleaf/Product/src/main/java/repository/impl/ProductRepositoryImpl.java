package repository.impl;

import models.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    public static Map<Integer, Product> products;
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
    public String save(Product product) {

        if (product.getName().isEmpty() | product.getPrice().isEmpty() | product.getDescription().isEmpty() | product.getProducer().isEmpty()){
            return "create";
        }
        products.put(product.getId(), product);
        return "redirect:/";
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
    public Product search( String name) {

        for (Product product : products.values()){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return new Product();
    }

    @Override
    public String searchReturn(Product product) {
        if (product.getName() != null) {
            return "searchProduct";
        }
        return "notSearch";

    }
}
