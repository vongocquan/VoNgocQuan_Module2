package com.codegym.repository;

import com.codegym.models.HopDongChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailRepository extends JpaRepository<HopDongChiTiet, Integer> {
}
