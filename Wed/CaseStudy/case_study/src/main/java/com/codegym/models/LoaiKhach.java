package com.codegym.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiKhach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String guestType;
    @OneToMany(mappedBy = "guestTypeCustomer")
    private List<KhachHang> customers;

    public LoaiKhach() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public List<KhachHang> getCustomers() {
        return customers;
    }

    public void setCustomers(List<KhachHang> customers) {
        this.customers = customers;
    }
}
