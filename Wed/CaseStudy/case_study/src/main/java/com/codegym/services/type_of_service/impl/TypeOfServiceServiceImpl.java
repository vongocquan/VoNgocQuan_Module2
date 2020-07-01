package com.codegym.services.type_of_service.impl;

import com.codegym.models.LoaiDichVu;
import com.codegym.repository.TypeOfServiceRepository;
import com.codegym.services.type_of_service.TypeOfServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeOfServiceServiceImpl implements TypeOfServiceService {
    @Autowired
    TypeOfServiceRepository typeOfServiceRepository;
    @Override
    public List<LoaiDichVu> findAll() {
        return typeOfServiceRepository.findAll();
    }
}
