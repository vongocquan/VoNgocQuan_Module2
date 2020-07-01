package com.codegym.services.khach_hang;

import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KhachHangService {
    Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContaining(String tenKhachHang, String chungMinhThu,
                                                                         Pageable pageable);
    Page<KhachHang> findAll(Pageable pageable);
    List<KhachHang> findAll();
    KhachHang findById(int id);
    void delete(int id);
    void save(KhachHang khachHang);
}
