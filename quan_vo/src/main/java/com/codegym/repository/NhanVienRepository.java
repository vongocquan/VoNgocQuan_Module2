package com.codegym.repository;

import com.codegym.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {


    List<NhanVien> findByMaNhanVienContainingOrHoVaTenContainingOrNgaySinhContaining(
            Integer maNhanVien, String hoVaTen, String ngaySinh
    );
    List<NhanVien> findByHoVaTenContainingOrNgaySinhContaining(
            String hoVaTen, String ngaySinh
    );
    List<NhanVien> findByHoVaTenContaining(String hoVaTen);
}
