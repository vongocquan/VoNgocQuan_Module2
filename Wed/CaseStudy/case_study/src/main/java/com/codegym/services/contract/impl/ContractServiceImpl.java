package com.codegym.services.contract.impl;

import com.codegym.models.HopDong;
import com.codegym.repository.ContractRepository;
import com.codegym.services.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;
    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public List<HopDong> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public HopDong findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public void save(HopDong contract) {
        contractRepository.save(contract);
    }
}
