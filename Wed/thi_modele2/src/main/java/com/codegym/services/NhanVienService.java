package com.codegym.services;

import com.codegym.models.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> findByMaNhanVienContainingOrNgaySinhContainingOrChungMinhThuContaining(
            String maNhanVien, String ngaySinh, String chungMinhThu
    );
    List<NhanVien> findAll();
    NhanVien findById(String id);
    void save(NhanVien nhanVien);
    void delete(String id);
}
