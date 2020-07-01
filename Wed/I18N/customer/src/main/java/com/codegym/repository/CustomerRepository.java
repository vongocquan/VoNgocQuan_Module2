package com.codegym.repository;

import com.codegym.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
