package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maLoaiDichVu;
    private String tenLoaiDichVu;
    @OneToMany(mappedBy = "loaiDichVu")
    private List<DichVu> listDichVu;

    public LoaiDichVu() {
    }

    public Integer getMaLoaiDichVu() {
        return maLoaiDichVu;
    }

    public void setMaLoaiDichVu(Integer maLoaiDichVu) {
        this.maLoaiDichVu = maLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<DichVu> getListDichVu() {
        return listDichVu;
    }

    public void setListDichVu(List<DichVu> listDichVu) {
        this.listDichVu = listDichVu;
    }
}
