package com.codegym.services.customer;

import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<KhachHang> findAll(Pageable pageable);
    List<KhachHang> findAll();
    KhachHang findById(int id);
    void delete(int id);
    void save(KhachHang customer);
}
