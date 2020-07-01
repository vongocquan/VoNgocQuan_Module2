package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class KieuThue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tenKieuThue;
    private String gia;
    @OneToMany(mappedBy = "kieuThue")
    private List<DichVu> listDichVu;

    public KieuThue() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
