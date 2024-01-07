package com.example.hotelmanagementsystem.controllers;

import com.example.hotelmanagementsystem.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CustomerController {
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){
        customerService.getCustomer(customerId);
    }

}
