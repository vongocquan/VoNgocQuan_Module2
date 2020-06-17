package com.codegym.customer.controllers;

import com.codegym.customer.models.Province;
import com.codegym.customer.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @RequestMapping("/")
    public String home(){
        return "list";
    }

    @RequestMapping("/province")
    public String homeProvince(Model model){
        Iterable<Province> provinces = provinceService.findAll();
        model.addAttribute("provinces", provinces);
        return "province/index";
    }
    @RequestMapping("/create-province")
    public String createForm(Model model){
        model.addAttribute("province", new Province());
        return "province/create";
    }
    @PostMapping("/create-province")
    public String create(@ModelAttribute(value = "province" ) Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @RequestMapping("/edit-province/{id}")
    public String editForm(@PathVariable(value = "id") int id, Model model){
        Province province = provinceService.findById(id);
        model.addAttribute("province", province);
        return "province/edit";
    }
    @PostMapping("/edit-province")
    public String edit(@ModelAttribute(value = "province") Province province){
        provinceService.save(province);
        return "redirect:/province";
    }
    @RequestMapping("/delete-province/{id}")
    public String deleteForm(@PathVariable(value = "id") int id, Model model){
        Province province = provinceService.findById(id);
        model.addAttribute("province", province);
        return "province/delete";
    }
    @PostMapping("/delete-province")
    public String delete(@ModelAttribute(value = "province") Province province){
        provinceService.remove(province.getId());
        return "redirect:/province";
    }
}
