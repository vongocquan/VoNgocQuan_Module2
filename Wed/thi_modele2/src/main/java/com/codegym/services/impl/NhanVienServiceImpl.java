package com.codegym.services.impl;

import com.codegym.models.NhanVien;
import com.codegym.repository.NhanVienRepository;
import com.codegym.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> findByMaNhanVienContainingOrNgaySinhContainingOrChungMinhThuContaining(
            String maNhanVien, String ngaySinh, String chungMinhThu) {
        return nhanVienRepository.findByMaNhanVienContainingOrNgaySinhContainingOrChungMinhThuContaining(
                maNhanVien,ngaySinh,chungMinhThu
        );
    }

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(String id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    @Override
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(String id) {
        nhanVienRepository.deleteById(id);
    }
}
