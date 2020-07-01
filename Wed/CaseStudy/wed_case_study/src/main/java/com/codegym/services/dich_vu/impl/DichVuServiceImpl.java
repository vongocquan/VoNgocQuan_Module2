package com.codegym.services.dich_vu.impl;

import com.codegym.models.DichVu;
import com.codegym.repository.DichVuRepository;
import com.codegym.services.dich_vu.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    DichVuRepository dichVuRepository;
    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }

    @Override
    public List<DichVu> findAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public DichVu findById(int id) {
        return dichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        dichVuRepository.deleteById(id);
    }

    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }
}
