package com.codegym.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
public class HopDongChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maHopDongChiTiet;
    @ManyToOne
    @JoinColumn(name = "ma_hop_dong")
    private HopDong hopDong;
    @ManyToOne
    @JoinColumn(name = "ma_dich_vu_di_kem")
    private DichVuDiKem dichVuDiKem;
    @Pattern(regexp = "[1-9]+(\\d)*", message = "Số Lượng là số nguyên dương")
    private String soLuong;

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

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
