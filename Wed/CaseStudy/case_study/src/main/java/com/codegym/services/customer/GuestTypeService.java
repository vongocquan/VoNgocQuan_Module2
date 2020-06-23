package com.codegym.services.customer;

import com.codegym.models.customer.GuestTypeCustomer;

import java.util.List;

public interface GuestTypeService {
    List<GuestTypeCustomer> findAll();
    GuestTypeCustomer findById(int id);
    void delete(int id);
    void save(GuestTypeCustomer guestTypeCustomer);
}
