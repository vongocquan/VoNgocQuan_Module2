package com.codegym.repository;

import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContaining(String tenKhachHang, String chungMinhThu, Pageable pageable);
    Page<KhachHang> findByTenKhachHangContainingOrChungMinhThuContainingOrNgaySinhContainingOrEmailContainingOrDiaChiContainingOrSoDienThoaiContaining(
            String tenKhachHang, String chungMinhThu, String ngaySinh, String email, String diaChi, String soDienThoai, Pageable pageable
    );
}
