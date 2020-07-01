package com.codegym.services.guest_type_customer;



import com.codegym.models.LoaiKhach;

import java.util.List;

public interface GuestTypeService {
    List<LoaiKhach> findAll();
}
