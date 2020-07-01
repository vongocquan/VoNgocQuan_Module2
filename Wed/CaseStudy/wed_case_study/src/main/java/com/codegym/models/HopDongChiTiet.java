package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HopDongChiTiet {
    @Id
    private Integer maHopDongChiTiet;
    @ManyToOne
    @JoinColumn(name = "ma_hop_dong")
    private HopDong hopDong;
    @ManyToOne
    @JoinColumn(name = "ma_dich_vu_di_kem")
    private DichVuDiKem dichVuDiKem;
    private Integer soLuong;

    public HopDongChiTiet() {
    }

    public Integer getMaHopDongChiTiet() {
        return maHopDongChiTiet;
    }

    public void setMaHopDongChiTiet(Integer maHopDongChiTiet) {
        this.maHopDongChiTiet = maHopDongChiTiet;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
