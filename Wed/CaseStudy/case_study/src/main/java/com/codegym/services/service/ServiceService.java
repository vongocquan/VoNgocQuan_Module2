package com.codegym.services.service;

import com.codegym.models.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    List<DichVu> findAll();
    Page<DichVu> findAll(Pageable pageable);
    DichVu findById(int id);
    void delete(int id);
    void save(DichVu dichVu);
}
