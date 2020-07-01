package com.codegym.services.rental_type.impl;


import com.codegym.models.KieuThue;
import com.codegym.repository.RentalTypeRepository;
import com.codegym.services.rental_type.RentalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RentalTypeServiceImpl implements RentalTypeService {
    @Autowired
    RentalTypeRepository rentalTypeRepository;
    @Override
    public List<KieuThue> findAll() {
        return rentalTypeRepository.findAll();
    }
}
