package com.codegym.services;

import com.codegym.models.HopDongChiTiet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HopDongChiTietService {
    Page<HopDongChiTiet> findAll(Pageable pageable);
    List<HopDongChiTiet> findAll();
    HopDongChiTiet findById(int id);
    void delete(int id);
    void save(HopDongChiTiet hopDongChiTiet);
}
