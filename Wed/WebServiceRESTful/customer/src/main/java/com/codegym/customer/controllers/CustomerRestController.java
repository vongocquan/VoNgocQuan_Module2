package com.codegym.customer.controllers;

import com.codegym.customer.models.Customer;
import com.codegym.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerRestController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getListCustomer(){
        List<Customer> customers = customerService.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id){
        Customer customer = customerService.findById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @RequestMapping(value = "customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable ("id") int id, @RequestBody Customer customer){
        Customer currentCustomer = customerService.findById(id);
        currentCustomer.setFirstName(customer.getFirstName());
        currentCustomer.setLastName(customer.getLastName());
        currentCustomer.setId(customer.getId());
        customerService.save(currentCustomer);
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id){
        Customer customer = customerService.findById(id);
        customerService.remove(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
