package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class TrinhDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maTrinhDo;
    private String trinhDo;
    @OneToMany(mappedBy = "trinhDo")
    List<NhanVien> listNhanVien;

    public TrinhDo() {
    }

    public Integer getMaTrinhDo() {
        return maTrinhDo;
    }

    public void setMaTrinhDo(Integer maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
}
