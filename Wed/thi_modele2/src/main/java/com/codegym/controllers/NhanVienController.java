package com.codegym.controllers;

import com.codegym.models.NhanVien;
import com.codegym.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @GetMapping("/")
    public String list(Model model,@RequestParam("key") Optional<String> key){
        if (!key.isPresent()){
            model.addAttribute("listNhanVien", nhanVienService.findAll());
            return "list";
        }
        model.addAttribute("listNhanVien", nhanVienService.findByMaNhanVienContainingOrNgaySinhContainingOrChungMinhThuContaining(
                key.get(),key.get(),key.get()
        ));
        return "list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("nhanVien", new NhanVien());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("nhanVien") NhanVien nhanVien, BindingResult bindingResult, Model model){
        new NhanVien().validate(nhanVien, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "create";
        }
        nhanVienService.save(nhanVien);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String editForm(Model model, @PathVariable String id){
        model.addAttribute("nhanVien", nhanVienService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute NhanVien nhanVien){
        nhanVienService.delete(nhanVien.getMaNhanVien());
        return "redirect:/";
    }
}
