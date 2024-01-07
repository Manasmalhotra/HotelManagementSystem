package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
