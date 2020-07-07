package com.codegym.repository;

import com.codegym.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    List<NhanVien> findByMaNhanVienContainingOrNgaySinhContainingOrChungMinhThuContaining(
            String maNhanVien, String ngaySinh, String chungMinhThu
    );
}
