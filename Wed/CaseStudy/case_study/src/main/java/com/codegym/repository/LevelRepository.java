package com.codegym.repository;

import com.codegym.models.TrinhDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<TrinhDo, Integer> {
}
