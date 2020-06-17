package com.codegym.customer.controllers;

import com.codegym.customer.models.Customer;
import com.codegym.customer.repository.ProvinceRepository;
import com.codegym.customer.services.CustomerService;
import com.codegym.customer.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProvinceService provinceService;
    @GetMapping("/customer")
    public String homeCustomer(Model model){
        Iterable<Customer> customers = customerService.findAll();
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
