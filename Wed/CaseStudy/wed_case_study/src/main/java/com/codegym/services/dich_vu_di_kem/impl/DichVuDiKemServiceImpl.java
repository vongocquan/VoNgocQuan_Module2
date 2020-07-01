package com.codegym.services.dich_vu_di_kem.impl;

import com.codegym.models.DichVuDiKem;
import com.codegym.models.KhachHang;
import com.codegym.repository.DichVuDiKemRepository;
import com.codegym.services.dich_vu_di_kem.DichVuDiKemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuDiKemServiceImpl implements DichVuDiKemService {
    @Autowired
    DichVuDiKemRepository dichVuDiKemRepository;
    @Override
    public Page<DichVuDiKem> findByDonViContainingOrGiaContainingOrTenDichVuDiKemContainingOrTrangThaiContaining(String donVi, String gia, String tenDichVuDiKem, String trangThai, Pageable pageable) {
        return dichVuDiKemRepository.findByDonViContainingOrGiaContainingOrTenDichVuDiKemContainingOrTrangThaiContaining(
                donVi, gia, tenDichVuDiKem, trangThai, pageable
        );
    }

    @Override
    public Page<DichVuDiKem> findAll(Pageable pageable) {
        return dichVuDiKemRepository.findAll(pageable);
    }

    @Override
    public List<DichVuDiKem> findAll() {
        return dichVuDiKemRepository.findAll();
    }

    @Override
    public DichVuDiKem findById(int id) {
        return dichVuDiKemRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        dichVuDiKemRepository.deleteById(id);
    }

    @Override
    public void save(DichVuDiKem dichVuDiKem) {
        dichVuDiKemRepository.save(dichVuDiKem);
    }
}
