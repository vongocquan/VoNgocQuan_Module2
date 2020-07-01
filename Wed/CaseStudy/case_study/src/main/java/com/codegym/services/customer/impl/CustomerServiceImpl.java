package com.codegym.services.customer.impl;

import com.codegym.models.KhachHang;
import com.codegym.repository.CustomerRepository;
import com.codegym.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<KhachHang> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public KhachHang findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void save(KhachHang customer) {
        customerRepository.save(customer);
    }
}
