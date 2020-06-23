package com.codegym.repository.customer;

import com.codegym.models.customer.GuestTypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestTypeCustomerRepository extends JpaRepository<GuestTypeCustomer, Integer> {
}
