package com.codegym.repository;

import com.codegym.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
}
