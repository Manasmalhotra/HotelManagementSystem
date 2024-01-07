package com.example.hotelmanagementsystem.controllers;

import com.example.hotelmanagementsystem.models.Customer;
import com.example.hotelmanagementsystem.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){
        return ResponseEntity.ok(customerService.getCustomer(customerId));
    }
}
