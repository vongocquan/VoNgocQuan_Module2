package com.codegym.controllers;

import com.codegym.models.KhachHang;
import com.codegym.services.KhachHangService;
import com.codegym.services.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    LoaiKhachService loaiKhachService;
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    //    *******************Khách Hàng*********************
    @RequestMapping("/customer")
    public String listCustomer(Model model, @PageableDefault(size = 3) Pageable pageable,
                               @RequestParam Optional<String> key){
        Page<KhachHang> listKhachHang = null;
        if (!key.isPresent()){
            listKhachHang = khachHangService.findAll(pageable);
            model.addAttribute("listKhachHang", listKhachHang);
        }
        else {
            listKhachHang = khachHangService.findByTenKhachHangContainingOrChungMinhThuContainingOrNgaySinhContainingOrEmailContainingOrDiaChiContainingOrSoDienThoaiContaining(
                    key.get(),key.get(),key.get(),key.get(),key.get(),key.get(),pageable
            );
            model.addAttribute("listKhachHang", listKhachHang);
            model.addAttribute("key", key.get());
        }
        List<KhachHang> list = listKhachHang.getContent();
        for (int i = 0; i < list.size(); i++){
            String ngaySinh = list.get(i).getNgaySinh();
            String[] arrNgaySinh = (ngaySinh.split("-"));
            list.get(i).setNgaySinh(arrNgaySinh[2]+"/"+arrNgaySinh[1]+"/"+arrNgaySinh[0]);
        }
//        model.addAttribute("list", list);
        return "khach_hang/list";
    }
    @RequestMapping("/customer-create")
    public String addCustomerForm(Model model){
        model.addAttribute("khachHang", new KhachHang());
        model.addAttribute("listLoaiKhach", loaiKhachService.findAll());
        return "khach_hang/create";
    }
    @PostMapping("/customer-create")
    public String addCustomer(@Valid @ModelAttribute("khachHang") KhachHang khachHang, BindingResult bindingResult,
                              Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("listLoaiKhach", loaiKhachService.findAll());
            return "khach_hang/create";
        }else {
            khachHangService.save(khachHang);
            return "redirect:/customer";
        }
    }
    @RequestMapping("/customer-edit/{id}")
    public String editCustomerForm(@PathVariable("id") String id, Model model){
        model.addAttribute("khachHang", khachHangService.findById(id));
        model.addAttribute("listLoaiKhach", loaiKhachService.findAll());
        return "khach_hang/edit";
    }
    @PostMapping("/customer-edit")
    public String editCustomer(@ModelAttribute("khachHang") KhachHang khachHang){
        khachHangService.save(khachHang);
        return "redirect:/customer";
    }

    @GetMapping("/customer-delete/{id}")
    public String deleteCustomer( @PathVariable("id") String id){
        khachHangService.delete(id);
        return "redirect:/customer";
    }
}
