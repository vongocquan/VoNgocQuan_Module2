package com.codegym.repository;

import com.codegym.models.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<NhanVien, Integer> {
}
