package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class HopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maHopDong;
    @ManyToOne
    @JoinColumn(name = "ma_nhan_vien")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "ma_khach_hang")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "ma_dich_vu")
    private DichVu dichVu;
    private String ngayLamHopDong;
    private String ngayKetThucHopDong;
    private int tienDatCoc;
    private int tongTien;
    @OneToMany(mappedBy = "hopDong")
    private List<HopDongChiTiet> hopDongChiTietList;
    public HopDong() {
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThucHopDong() {
        return ngayKetThucHopDong;
    }

    public void setNgayKetThucHopDong(String ngayKetThucHopDong) {
        this.ngayKetThucHopDong = ngayKetThucHopDong;
    }

    public int getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(int tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public List<HopDongChiTiet> getHopDongChiTietList() {
        return hopDongChiTietList;
    }

    public void setHopDongChiTietList(List<HopDongChiTiet> hopDongChiTietList) {
        this.hopDongChiTietList = hopDongChiTietList;
    }
}
