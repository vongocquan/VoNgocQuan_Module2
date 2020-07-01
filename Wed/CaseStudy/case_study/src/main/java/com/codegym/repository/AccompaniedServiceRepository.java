package com.codegym.repository;

import com.codegym.models.DichVuDiKem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccompaniedServiceRepository extends JpaRepository<DichVuDiKem, Integer> {
}
