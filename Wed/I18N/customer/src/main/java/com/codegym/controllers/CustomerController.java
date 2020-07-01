package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String index(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "index";
    }
    @RequestMapping("/create")
    public String createForm(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute(value = "customer") Customer customer){
        customerService.save(customer);
        return "redirect:/";
    }
    @RequestMapping("/customer/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "delete";
    }
    @PostMapping("/delete")
    public  String delete(@RequestParam(value = "id") int id){
        customerService.remove(id);
        return "redirect:/";
    }
    @RequestMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model){
        Customer customer= customerService.findById(id);
        model.addAttribute("customer", customer);
        return "view";
    }
}
