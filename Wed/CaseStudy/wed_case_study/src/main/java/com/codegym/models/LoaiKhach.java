package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiKhach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maLoaiKhachHang;
    private String loaiKhach;
    @OneToMany(mappedBy = "loaiKhach")
    private List<KhachHang> listKhachHang;

    public LoaiKhach() {
    }

    public Integer getMaLoaiKhachHang() {
        return maLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(Integer maLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public List<KhachHang> getListKhachHang() {
        return listKhachHang;
    }

    public void setListKhachHang(List<KhachHang> listKhachHang) {
        this.listKhachHang = listKhachHang;
    }
}
