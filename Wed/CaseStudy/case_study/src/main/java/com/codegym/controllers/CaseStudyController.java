package com.codegym.controllers;

import com.codegym.models.HopDong;
import com.codegym.models.KhachHang;
import com.codegym.models.DichVu;
import com.codegym.services.contract.ContractService;
import com.codegym.services.customer.CustomerService;
import com.codegym.services.employee.EmployeeService;
import com.codegym.services.guest_type_customer.GuestTypeService;
import com.codegym.services.rental_type.RentalTypeService;
import com.codegym.services.service.ServiceService;
import com.codegym.services.type_of_service.TypeOfServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CaseStudyController {
    @Autowired
    CustomerService customerService;
    @Autowired
    GuestTypeService guestTypeService;
    @Autowired
    ServiceService serviceService;
    @Autowired
    RentalTypeService rentalTypeService;
    @Autowired
    TypeOfServiceService typeOfServiceService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    ContractService contractService;
    @RequestMapping("/")
    public String home(){
        return "home";
    }

//    *********************Customer************************
    @GetMapping("/customer")
    public String showCustomer(Model model, @PageableDefault(size = 3)Pageable pageable){
        Page<KhachHang> customers = customerService.findAll(pageable);
        model.addAttribute("customers", customers);
        return "customer/list";
    }
    @GetMapping ("/create-customer")
    public String addCustomerForm(Model model){
        model.addAttribute("customer", new KhachHang());
        model.addAttribute("guestType", guestTypeService.findAll());
        return "customer/create";
    }
    @PostMapping("/create-customer")
    public String addCustomer(@ModelAttribute("customer") KhachHang customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/customer-edit/{id}")
    public String updateCustomerForm(@PathVariable("id") int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("guestType", guestTypeService.findAll());
        return "customer/edit";
    }
    @PostMapping("/customer-edit")
    public String updateCustomer(@ModelAttribute(value = "customer") KhachHang customer){
        customerService.save(customer);
        return "redirect:/customer";
    }
    @RequestMapping("/customer-delete/{id}")
    public String deleteCustomerForm(@PathVariable("id") int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "customer/delete";
    }
    @PostMapping("/customer-delete")
    public String deleteCustomer(@ModelAttribute(value = "customer") KhachHang customer){

        customerService.delete(customer.getMaKhachHang());
        return "redirect:/customer";
    }

//    ************Service*******************
    @RequestMapping("/service")
    public String showService(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("services", serviceService.findAll(pageable));
        return "service/list";
    }
    @RequestMapping("/create-service")
    public String addServiceForm(Model model){
        model.addAttribute("service", new DichVu());
        model.addAttribute("rentalTypes", rentalTypeService.findAll());
        model.addAttribute("typeOfServices", typeOfServiceService.findAll());
        return "service/create";
    }
    @PostMapping("/create-service")
    public String addService(@ModelAttribute("service") DichVu dichVu){
        serviceService.save(dichVu);
        return "redirect:/service";
    }
    @RequestMapping("/service-edit/{id}")
    public String updateServiceForm(@PathVariable("id") int id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        model.addAttribute("rentalTypes", rentalTypeService.findAll());
        model.addAttribute("typeOfServices", typeOfServiceService.findAll());
        return "service/edit";
    }
    @PostMapping("/service-edit")
    public String updateService(@ModelAttribute("service") DichVu dichVu){
        serviceService.save(dichVu);
        return "redirect:/service";
    }
    @RequestMapping("/service-delete/{id}")
    public String deleteServiceForm(@PathVariable("id") int id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        return "service/delete";
    }
    @PostMapping("/service-delete")
    public String deleteService(@ModelAttribute("service") DichVu dichVu){
        serviceService.delete(dichVu.getMaDichVu());
        return "redirect:/service";
    }

//    ********************Contract*******************
    @RequestMapping("/contract")
    public String showContract(Model model, Pageable pageable){
        model.addAttribute("contracts", contractService.findAll(pageable));
        return "contract/list";
    }
    @RequestMapping("/create-contract")
    public String addContractForm(Model model){
        model.addAttribute("contract", new HopDong());
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("services", serviceService.findAll());
        return "contract/create";
    }
    @PostMapping("/create-contract")
    public String addContract(@ModelAttribute("contract") HopDong contract){
        contractService.save(contract);
        return "redirect:/contract";
    }
}
