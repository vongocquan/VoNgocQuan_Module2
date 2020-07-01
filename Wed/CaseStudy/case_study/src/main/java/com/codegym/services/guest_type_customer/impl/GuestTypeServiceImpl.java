package com.codegym.services.guest_type_customer.impl;

import com.codegym.models.LoaiKhach;
import com.codegym.repository.GuestTypeCustomerRepository;
import com.codegym.services.guest_type_customer.GuestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestTypeServiceImpl implements GuestTypeService {
    @Autowired
    GuestTypeCustomerRepository guestTypeCustomerRepository;
    @Override
    public List<LoaiKhach> findAll() {
        return guestTypeCustomerRepository.findAll();
    }
}
