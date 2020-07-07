package com.codegym.services.impl;

import com.codegym.models.NhanVien;
import com.codegym.repository.NhanVienRepository;
import com.codegym.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    @Override
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(Integer id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public List<NhanVien> search(Optional<String> key) {
        if (!key.isPresent()){
            return nhanVienRepository.findAll();
        }else {
            try {
                return nhanVienRepository.findByMaNhanVienContainingOrHoVaTenContainingOrNgaySinhContaining(
                        Integer.parseInt(key.get()), key.get(), key.get()
                );
            }catch (Exception e){
                System.out.println(Integer.parseInt(key.get()));
                return nhanVienRepository.findByHoVaTenContainingOrNgaySinhContaining(key.get(), key.get());
            }
        }
    }

}
