package com.codegym.services.employee;

import com.codegym.models.NhanVien;

import java.util.List;

public interface EmployeeService {
    List<NhanVien> findAll();
    NhanVien findById(int id);
    void delete(int id);
    void save(NhanVien nhanVien);
}
