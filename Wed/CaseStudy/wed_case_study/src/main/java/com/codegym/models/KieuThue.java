package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class KieuThue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maKieuThue;
    private String tenKieuThue;
    private String gia;
    @OneToMany(mappedBy = "kieuThue")
    private List<DichVu> listDichVu;

    public KieuThue() {
    }

    public Integer getMaKieuThue() {
        return maKieuThue;
    }

    public void setMaKieuThue(Integer maKieuThue) {
        this.maKieuThue = maKieuThue;
    }

    public String getTenKieuThue() {
        return tenKieuThue;
    }

    public void setTenKieuThue(String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public List<DichVu> getListDichVu() {
        return listDichVu;
    }

    public void setListDichVu(List<DichVu> listDichVu) {
        this.listDichVu = listDichVu;
    }
}
