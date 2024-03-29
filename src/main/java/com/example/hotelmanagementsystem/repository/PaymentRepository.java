package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
}
