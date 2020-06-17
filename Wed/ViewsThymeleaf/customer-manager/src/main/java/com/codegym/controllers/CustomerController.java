package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.services.CustomerService;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @RequestMapping("/")
    public String showCustomer(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }
    @RequestMapping (value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute(value = "customer") Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Customer customer){
        customerService.update(customer.getId(), customer);
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/";
    }
    @RequestMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "views";
    }
}
