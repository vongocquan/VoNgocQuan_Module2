package com.codegym.repository;

import com.codegym.models.DichVuDiKem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichVuDiKemRepository extends JpaRepository<DichVuDiKem, Integer> {
    Page<DichVuDiKem> findByDonViContainingOrGiaContainingOrTenDichVuDiKemContainingOrTrangThaiContaining(
            String donVi, String gia, String tenDichVuDiKem, String trangThai, Pageable pageable
    );
}
