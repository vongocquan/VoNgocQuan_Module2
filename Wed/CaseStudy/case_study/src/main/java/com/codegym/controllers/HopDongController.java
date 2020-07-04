package com.codegym.controllers;

import com.codegym.models.HopDong;
import com.codegym.services.DichVuService;
import com.codegym.services.HopDongService;
import com.codegym.services.KhachHangService;
import com.codegym.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HopDongController {
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    HopDongService hopDongService;
    @RequestMapping("/contract-create")
    public String addContractForm(Model model){
        model.addAttribute("lisNhanVien", nhanVienService.findAll());
        model.addAttribute("listKhachHang", khachHangService.findAll());
        model.addAttribute("listDichVu", dichVuService.findAll());
        model.addAttribute("hopDong", new HopDong());
        return "hop_dong/create";
    }
    @PostMapping("/contract-create")
    public String createContract(@Valid @ModelAttribute("hopDong") HopDong hopDong, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("lisNhanVien", nhanVienService.findAll());
            model.addAttribute("listKhachHang", khachHangService.findAll());
            model.addAttribute("listDichVu", dichVuService.findAll());
            return "hop_dong/create";
        }
        hopDongService.save(hopDong);
        model.addAttribute("message", "thêm hợp đồng thành công");
        model.addAttribute("lisNhanVien", nhanVienService.findAll());
        model.addAttribute("listKhachHang", khachHangService.findAll());
        model.addAttribute("listDichVu", dichVuService.findAll());
        model.addAttribute("hopDong", new HopDong());
        return "hop_dong/create";
    }
}
