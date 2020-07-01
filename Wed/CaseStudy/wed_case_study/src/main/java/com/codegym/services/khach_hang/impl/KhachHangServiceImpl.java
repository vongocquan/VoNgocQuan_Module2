package com.codegym.services.khach_hang.impl;

import com.codegym.models.KhachHang;
import com.codegym.repository.KhachHangRepository;
import com.codegym.services.khach_hang.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContaining(String tenKhachHang, String chungMinhThu, Pageable pageable) {
        return khachHangRepository.findByTenKhachHangContainingOrChungMinhThuContaining(tenKhachHang, chungMinhThu,pageable);
    }

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang findById(int id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }
}
