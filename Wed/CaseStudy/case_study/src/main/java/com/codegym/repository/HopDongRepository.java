package com.codegym.repository;

import com.codegym.models.HopDong;
import com.codegym.models.KhachHang;
import org.hibernate.sql.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HopDongRepository extends JpaRepository<HopDong, Integer> {
    Page<HopDong> findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(String ngayKetThucHopDong, String ngayLamHopDong,
                                                                               Pageable pageable);

}
