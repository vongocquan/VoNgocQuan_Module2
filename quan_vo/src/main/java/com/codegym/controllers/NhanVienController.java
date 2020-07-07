package com.codegym.controllers;

import com.codegym.models.NhanVien;
import com.codegym.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;
    @GetMapping("/")
    public String home(Model model, @RequestParam("key") Optional<String> key){
        List<NhanVien> listNhanVien = nhanVienService.search(key);
        model.addAttribute("listNhanVien", listNhanVien);
        return "list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("nhanVien", new NhanVien());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("nhanVien") NhanVien nhanVien, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "create";
        }
        nhanVienService.save(nhanVien);
        return "redirect:/";
    }
}
