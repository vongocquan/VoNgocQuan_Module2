package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class TrinhDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String level;
    @OneToMany(mappedBy = "trinh_do")
    List<NhanVien> listNhanVien;

    public TrinhDo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }
}
