package com.codegym.services;

import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContaining(String tenKhachHang, String chungMinhThu,
                                                                         Pageable pageable);
    Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContainingOrNgaySinhContainingOrEmailContainingOrDiaChiContainingOrSoDienThoaiContaining(
            String tenKhachHang, String chungMinhThu, String ngaySinh, String email, String diaChi, String soDienThoai, Pageable pageable
    );
    Page<KhachHang> findAll(Pageable pageable);
    List<KhachHang> findAll();
    KhachHang findById(String id);
    void delete(String id);
    void save(KhachHang khachHang);
}
