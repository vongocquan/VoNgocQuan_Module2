package com.codegym.services.dich_vu;

import com.codegym.models.DichVu;
import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuService {
    Page<DichVu> findAll(Pageable pageable);
    List<DichVu> findAll();
    DichVu findById(int id);
    void delete(int id);
    void save(DichVu dichVu);
}
