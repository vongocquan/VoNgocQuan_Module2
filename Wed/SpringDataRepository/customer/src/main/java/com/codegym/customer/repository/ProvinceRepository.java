package com.codegym.customer.repository;

import com.codegym.customer.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}
