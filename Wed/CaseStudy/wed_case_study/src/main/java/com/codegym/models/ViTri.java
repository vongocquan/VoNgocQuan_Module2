package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maViTri;
    private String tenViTri;
    @OneToMany(mappedBy = "viTri")
    private List<NhanVien> listNhanVien;

    public ViTri() {
    }

    public Integer getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(Integer maViTri) {
        this.maViTri = maViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
}
