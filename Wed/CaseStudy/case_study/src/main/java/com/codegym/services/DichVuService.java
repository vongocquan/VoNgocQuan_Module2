package com.codegym.services;

import com.codegym.models.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuService {
    Page<DichVu> findByMaDichVuContainingOrTenDichVuContainingOrDienTichSuDungContainingOrSoNguoiToiDaContainingOrChiPhiThueContaining(
            String maDichVu, String tenDichVu, String dienTichSuDung, String soNguoiToiDa, String chiPhiThue, Pageable pageable
    );
    Page<DichVu> findAll(Pageable pageable);
    List<DichVu> findAll();
    DichVu findById(String id);
    void delete(String id);
    void save(DichVu dichVu);
}
