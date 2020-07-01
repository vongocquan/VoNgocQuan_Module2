package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "position")
    private List<NhanVien> employees;

    public ViTri() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NhanVien> getEmployees() {
        return employees;
    }

    public void setEmployees(List<NhanVien> employees) {
        this.employees = employees;
    }
}
