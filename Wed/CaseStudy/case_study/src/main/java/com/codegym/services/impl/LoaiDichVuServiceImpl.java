package com.codegym.services.impl;

import com.codegym.models.LoaiDichVu;
import com.codegym.repository.LoaiDichVuRepository;
import com.codegym.services.LoaiDichVuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiDichVuServiceImpl implements LoaiDichVuService {
    @Autowired
    LoaiDichVuRepository loaiDichVuRepository;
    @Override
    public List<LoaiDichVu> findAll() {
        return loaiDichVuRepository.findAll();
    }
}
