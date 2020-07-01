package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class DichVuDiKem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maDichVuDiKem;
    private String tenDichVuDiKem;
    private Integer gia;
    private Integer donVi;
    private String trangThai;
    @OneToMany(mappedBy = "dichVuDiKem")
    private List<HopDongChiTiet> listHopDongChiTiet;

    public DichVuDiKem() {
    }

    public Integer getMaDichVuDiKem() {
        return maDichVuDiKem;
    }

    public void setMaDichVuDiKem(Integer maDichVuDiKem) {
        this.maDichVuDiKem = maDichVuDiKem;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getDonVi() {
        return donVi;
    }

    public void setDonVi(Integer donVi) {
        this.donVi = donVi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public List<HopDongChiTiet> getListHopDongChiTiet() {
        return listHopDongChiTiet;
    }

    public void setListHopDongChiTiet(List<HopDongChiTiet> listHopDongChiTiet) {
        this.listHopDongChiTiet = listHopDongChiTiet;
    }
}
