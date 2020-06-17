package com.codegym.customer.services;

import com.codegym.customer.models.Customer;
import com.codegym.customer.models.Province;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(Integer id);
    void save(Customer customer);
    void remove(Integer id);
}
