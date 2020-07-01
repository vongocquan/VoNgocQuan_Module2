package com.codegym.services.hop_dong.impl;

import com.codegym.models.HopDong;
import com.codegym.repository.HopDongRepository;
import com.codegym.services.hop_dong.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    HopDongRepository hopDongRepository;

    @Override
    public Page<HopDong> findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(String ngayKetThucHopDong, String ngayLamHopDong,
                                                                                Pageable pageable) {
        return hopDongRepository.findByNgayKetThucHopDongContainingOrNgayLamHopDongContaining(ngayKetThucHopDong,
                ngayLamHopDong, pageable);
    }

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopDongRepository.findAll(pageable);
    }

    @Override
    public List<HopDong> findAll() {
        return hopDongRepository.findAll();
    }

    @Override
    public HopDong findById(int id) {
        return hopDongRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        hopDongRepository.deleteById(id);
    }

    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }
}
