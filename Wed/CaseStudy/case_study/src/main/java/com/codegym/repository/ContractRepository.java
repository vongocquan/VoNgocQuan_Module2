package com.codegym.repository;

import com.codegym.models.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<HopDong, Integer> {
}
