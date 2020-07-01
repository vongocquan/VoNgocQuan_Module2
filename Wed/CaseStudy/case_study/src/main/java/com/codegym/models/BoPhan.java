package com.codegym.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class BoPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maBoPhan;
    private String tenBoPhan;
    @OneToMany(mappedBy = "nhanVien")
    List<NhanVien> listNhanVien;

    public BoPhan() {
    }

    public Integer getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(Integer maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
}
