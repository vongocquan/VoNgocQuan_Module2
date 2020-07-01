package com.codegym.services.employee.impl;

import com.codegym.models.NhanVien;
import com.codegym.repository.EmployeeRepository;
import com.codegym.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<NhanVien> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public NhanVien findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void save(NhanVien employee) {
        employeeRepository.save(employee);
    }
}
