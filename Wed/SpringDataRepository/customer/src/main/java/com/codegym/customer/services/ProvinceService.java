package com.codegym.customer.services;

import com.codegym.customer.models.Province;

import java.util.List;

public interface ProvinceService {
    Iterable<Province> findAll();
    Province findById(Integer id);
    void save(Province province);
    void remove(Integer id);
}
