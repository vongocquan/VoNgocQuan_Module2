package com.codegym.repository;

import com.codegym.models.BoPhan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<BoPhan, Integer> {
}
