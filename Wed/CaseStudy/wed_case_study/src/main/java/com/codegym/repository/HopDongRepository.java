package com.codegym.repository;

import com.codegym.models.HopDong;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopDongRepository extends JpaRepository<HopDong, Integer> {
    Page<HopDong> findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(String ngayKetThucHopDong, String ngayLamHopDong,
                                                                              Pageable pageable);
}
