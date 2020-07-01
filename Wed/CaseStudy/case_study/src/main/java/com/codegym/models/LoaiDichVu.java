package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameTypeOfService;
    @OneToMany(mappedBy = "typeOfService")
    private List<DichVu> dichVus;

    public LoaiDichVu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTypeOfService() {
        return nameTypeOfService;
    }

    public void setNameTypeOfService(String name_type_of_service) {
        this.nameTypeOfService = name_type_of_service;
    }

    public List<DichVu> getDichVus() {
        return dichVus;
    }

    public void setDichVus(List<DichVu> dichVus) {
        this.dichVus = dichVus;
    }
}
