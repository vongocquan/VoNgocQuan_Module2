package com.codegym.services;

import com.codegym.models.NhanVien;

import java.util.List;
import java.util.Optional;

public interface NhanVienService {
    List<NhanVien> findAll();
    NhanVien findById(Integer id);
    void save(NhanVien nhanVien);
    void delete(Integer id);
    List<NhanVien> search(Optional<String> key);
}
