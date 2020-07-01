package com.codegym.services.service.impl;

import com.codegym.models.DichVu;
import com.codegym.repository.ServiceRepository;
import com.codegym.services.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<DichVu> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public DichVu findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void save(DichVu dichVu) {
        serviceRepository.save(dichVu);
    }
}
