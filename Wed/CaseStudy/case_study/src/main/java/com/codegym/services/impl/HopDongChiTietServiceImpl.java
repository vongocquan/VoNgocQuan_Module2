package com.codegym.services.impl;

import com.codegym.models.HopDongChiTiet;
import com.codegym.repository.HopDongChiTietRepository;

import com.codegym.services.HopDongChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongChiTietServiceImpl implements HopDongChiTietService {
    @Autowired
    HopDongChiTietRepository hopDongChiTietRepository;
    @Override
    public Page<HopDongChiTiet> findAll(Pageable pageable) {
        return hopDongChiTietRepository.findAll(pageable);
    }

    @Override
    public List<HopDongChiTiet> findAll() {
        return hopDongChiTietRepository.findAll();
    }

    @Override
    public HopDongChiTiet findById(int id) {
        return hopDongChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        hopDongChiTietRepository.deleteById(id);
    }

    @Override
    public void save(HopDongChiTiet hopDongChiTiet) {
        hopDongChiTietRepository.save(hopDongChiTiet);
    }
}
