package com.codegym.repository;

import com.codegym.models.LoaiKhach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestTypeCustomerRepository extends JpaRepository<LoaiKhach, Integer> {
}
