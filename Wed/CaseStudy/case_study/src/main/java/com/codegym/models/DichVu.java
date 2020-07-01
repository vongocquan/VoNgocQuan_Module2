package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maDichVu;
    @OneToMany(mappedBy = "hopDong")
    List<HopDong> listHopDong;
    private String tenDichVu;
    private String dienTich;
    private Integer soTang;
    private Integer soNguoiToiDa;
    private String chiPhiThue;
    @ManyToOne
    @JoinColumn(name = "kieu_thue_id")
    private KieuThue kieuThue;
    @ManyToOne
    @JoinColumn(name = "loai_dich_vu_id")
    private LoaiDichVu loaiDichVu;
    private String trangThai;

    public DichVu() {
    }

    public Integer getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(Integer maDichVu) {
        this.maDichVu = maDichVu;
    }

    public List<HopDong> getListHopDong() {
        return listHopDong;
    }

    public void setListHopDong(List<HopDong> listHopDong) {
        this.listHopDong = listHopDong;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
