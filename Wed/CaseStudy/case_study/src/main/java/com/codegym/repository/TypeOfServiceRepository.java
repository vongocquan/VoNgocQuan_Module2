package com.codegym.repository;

import com.codegym.models.LoaiDichVu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfServiceRepository extends JpaRepository<LoaiDichVu, Integer> {
}
