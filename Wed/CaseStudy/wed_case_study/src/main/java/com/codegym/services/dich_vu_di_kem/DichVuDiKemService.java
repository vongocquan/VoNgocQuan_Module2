package com.codegym.services.dich_vu_di_kem;

import com.codegym.models.DichVuDiKem;
import com.codegym.models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DichVuDiKemService {
    Page<DichVuDiKem> findByDonViContainingOrGiaContainingOrTenDichVuDiKemContainingOrTrangThaiContaining(
            String donVi, String gia, String tenDichVuDiKem, String trangThai, Pageable pageable
    );
    Page<DichVuDiKem> findAll(Pageable pageable);
    List<DichVuDiKem> findAll();
    DichVuDiKem findById(int id);
    void delete(int id);
    void save(DichVuDiKem dichVuDiKem);
}
