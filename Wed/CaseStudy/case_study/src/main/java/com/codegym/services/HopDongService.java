package com.codegym.services;

import com.codegym.models.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HopDongService {
    Page<HopDong> findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(String ngayKetThucHopDong,
                                                                               String ngayLamHopDong, Pageable pageable);
    Page<HopDong> findAll(Pageable pageable);
    List<HopDong> findAll();
    HopDong findById(int id);
    void delete(int id);
    void save(HopDong hopDong);
}
