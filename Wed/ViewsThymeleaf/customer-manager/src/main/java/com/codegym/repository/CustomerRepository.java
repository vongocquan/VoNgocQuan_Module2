package com.codegym.repository;

import com.codegym.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
