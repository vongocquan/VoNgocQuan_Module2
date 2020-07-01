package com.codegym.services.loai_khach.impl;

import com.codegym.models.LoaiKhach;
import com.codegym.repository.LoaiKhachRepository;
import com.codegym.services.loai_khach.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiKhachServiceImpl implements LoaiKhachService {
    @Autowired
    LoaiKhachRepository loaiKhachRepository;
    @Override
    public List<LoaiKhach> findAll() {
        return loaiKhachRepository.findAll();
    }
}
