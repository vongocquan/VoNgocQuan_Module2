package com.codegym.services.customer;

import com.codegym.models.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void delete(int id);
    void save(Customer customer);
}
