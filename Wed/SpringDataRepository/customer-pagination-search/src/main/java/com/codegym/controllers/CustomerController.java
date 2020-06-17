package com.codegym.controllers;


import com.codegym.models.Customer;
import com.codegym.services.CustomerService;
import com.codegym.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;
    @GetMapping("/customer")
    public String homeCustomer(Model model, @PageableDefault(size = 3) Pageable pageable,
                               @RequestParam Optional<String> keyword){
        Page<Customer> customers;
        if (!keyword.isPresent()){
             customers = customerService.findAll(pageable);
        }else {
             customers = customerService.findByFirstNameContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("customers", customers);

        return "customer/list";
    }
    @GetMapping("/create-customer")
    public String createForm(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("listProvince", provinceService.findAll());
        return "customer/create";
    }
    @PostMapping("/create-customer")
    public String create(@ModelAttribute(value = "customer") Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/edit-customer/{id}")
    public String editForm(@PathVariable(value = "id") int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        model.addAttribute("listProvince", provinceService.findAll());
        return "customer/edit";
    }
    @PostMapping("/edit-customer")
    public String edit(@ModelAttribute(value = "customer") Customer customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/delete-customer/{id}")
    public String deleteForm(@PathVariable(value = "id") int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "customer/delete";
    }
    @PostMapping("/delete-customer")
    public String delete(@ModelAttribute(value = "customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/customer";
    }

}
