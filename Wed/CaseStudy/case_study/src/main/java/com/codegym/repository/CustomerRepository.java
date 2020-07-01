package com.codegym.repository;

import com.codegym.models.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<KhachHang, Integer> {
}
