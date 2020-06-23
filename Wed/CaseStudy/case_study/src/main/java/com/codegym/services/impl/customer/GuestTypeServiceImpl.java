package com.codegym.services.impl.customer;

import com.codegym.models.customer.GuestTypeCustomer;
import com.codegym.repository.customer.GuestTypeCustomerRepository;
import com.codegym.services.customer.GuestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestTypeServiceImpl implements GuestTypeService {
    @Autowired
    GuestTypeCustomerRepository guestTypeCustomerRepository;
    @Override
    public List<GuestTypeCustomer> findAll() {
        return guestTypeCustomerRepository.findAll();
    }

    @Override
    public GuestTypeCustomer findById(int id) {
        return guestTypeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        guestTypeCustomerRepository.deleteById(id);
    }

    @Override
    public void save(GuestTypeCustomer guestTypeCustomer) {
        guestTypeCustomerRepository.save(guestTypeCustomer);
    }
}
