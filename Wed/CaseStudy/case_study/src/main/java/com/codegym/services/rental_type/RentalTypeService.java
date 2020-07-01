package com.codegym.services.rental_type;



import com.codegym.models.KieuThue;

import java.util.List;

public interface RentalTypeService {
    List<KieuThue> findAll();
}
