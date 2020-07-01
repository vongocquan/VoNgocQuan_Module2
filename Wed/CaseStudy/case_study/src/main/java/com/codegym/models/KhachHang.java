package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maKhachHang;
    @ManyToOne
    @JoinColumn(name = "ma_loai_khach")
    private LoaiKhach loaiKhach;
    @OneToMany(mappedBy = "khachHang")
    private List<HopDong> hopDongList;
    private String tenKhachHang;
    private String ngaySinh;
    private String chungMinhThu;
    private String soDienThoai;
    private String email;
    private String diaChi;

    public KhachHang() {
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChungMinhThu() {
        return chungMinhThu;
    }

    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
