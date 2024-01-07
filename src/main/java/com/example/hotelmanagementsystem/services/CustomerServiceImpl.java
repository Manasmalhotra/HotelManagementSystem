package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Customer;
import com.example.hotelmanagementsystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    @Override
    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }
}
