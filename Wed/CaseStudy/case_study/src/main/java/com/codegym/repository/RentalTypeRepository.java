package com.codegym.repository;

import com.codegym.models.KieuThue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalTypeRepository extends JpaRepository<KieuThue, Integer> {
}
