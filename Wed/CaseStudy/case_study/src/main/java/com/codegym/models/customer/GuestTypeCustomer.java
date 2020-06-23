package com.codegym.models.customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class GuestTypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String guestType;
    @OneToMany(mappedBy = "guestTypeCustomer")
    private List<Customer> customers;

    public GuestTypeCustomer() {
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

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
