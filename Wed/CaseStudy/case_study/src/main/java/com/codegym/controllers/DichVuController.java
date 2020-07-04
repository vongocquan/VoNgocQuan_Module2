package com.codegym.controllers;

import com.codegym.models.DichVu;
import com.codegym.services.DichVuService;
import com.codegym.services.KieuThueService;
import com.codegym.services.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class DichVuController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KieuThueService kieuThueService;
    @Autowired
    LoaiDichVuService loaiDichVuService;
    @RequestMapping("/service")
    public String listService(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> key){
        if (!key.isPresent()){
            model.addAttribute("listDichVu", dichVuService.findAll(pageable));
        }else {

            model.addAttribute("listDichVu", dichVuService.findByMaDichVuContainingOrTenDichVuContainingOrDienTichSuDungContainingOrSoNguoiToiDaContainingOrChiPhiThueContaining(
                    key.get(), key.get(), key.get(), key.get(), key.get(), pageable));
            model.addAttribute("key",key);
        }
        return "dich_vu/list";
    }
    @RequestMapping("/service-create")
    public String addServiceForm1(Model model){
        model.addAttribute("dichVu", new DichVu());
        model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
        model.addAttribute("listKieuThue", kieuThueService.findAll());
        return "dich_vu/create";
    }
    @PostMapping("/service-create")
    public String addServiceForm2(@Valid @ModelAttribute("dichVu") DichVu dichVu, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
            model.addAttribute("listKieuThue", kieuThueService.findAll());
            return "dich_vu/create";
        }
        else {
            model.addAttribute("dichVu", dichVu);
            return "dich_vu/create_other";
        }
    }
    @PostMapping("/service-create/other")
    public String addService(@Valid @ModelAttribute("dichVu") DichVu dichVu, BindingResult bindingResult, Model model){
        model.addAttribute("dichVu", dichVu);
        if (bindingResult.hasFieldErrors()){
            return "dich_vu/create_other";
        }
        dichVuService.save(dichVu);
        return "redirect:/service";
    }
    @RequestMapping("/service-edit/{id}")
    public String updateServiceForm1(@Valid @PathVariable("id") String id, Model model){
        model.addAttribute("dichVu", dichVuService.findById(id));
        model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
        model.addAttribute("listKieuThue", kieuThueService.findAll());
        return "dich_vu/edit";
    }
    @PostMapping("/service-edit/type-service")
    public String updateServiceForm2(@Valid @ModelAttribute("dichVu") DichVu dichVu, BindingResult bindingResult, Model model){
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("listLoaiDichVu", loaiDichVuService.findAll());
            model.addAttribute("listKieuThue", kieuThueService.findAll());
            return "dich_vu/edit";
        }
        model.addAttribute("dichVu", dichVu);
        return "dich_vu/edit_other";
    }
    @PostMapping("/service-edit/other")
    public String updateService(@Valid @ModelAttribute("dichVu") DichVu dichVu, BindingResult bindingResult, Model model){
        model.addAttribute("dichVu", dichVu);
        if (bindingResult.hasFieldErrors()){
            return "dich_vu/edit_other";
        }
        dichVuService.save(dichVu);
        return "redirect:/service";
    }
    @GetMapping("/service-delete/{id}")
    public String deleteService( @PathVariable("id") String id){
        dichVuService.delete(id);
        return "redirect:/service";
    }
}
