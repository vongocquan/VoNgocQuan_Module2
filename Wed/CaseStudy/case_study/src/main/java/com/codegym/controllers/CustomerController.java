package com.codegym.controllers;

import com.codegym.models.customer.Customer;
import com.codegym.services.customer.CustomerService;
import com.codegym.services.customer.GuestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    GuestTypeService guestTypeService;
    @RequestMapping("/customer")
    public String homeCustomer(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customer/home";
    }

}
