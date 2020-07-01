package com.codegym.services.accompanied_service.impl;

import com.codegym.models.DichVuDiKem;
import com.codegym.repository.AccompaniedServiceRepository;
import com.codegym.services.accompanied_service.AccompaniedServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccompaniedServiceServiceImpl implements AccompaniedServiceService {
    @Autowired
    AccompaniedServiceRepository accompaniedServiceRepository;
    @Override
    public List<DichVuDiKem> findAll() {
        return accompaniedServiceRepository.findAll();
    }
}
