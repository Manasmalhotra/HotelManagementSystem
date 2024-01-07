package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Payment;

public interface PaymentService {
    Payment getPayment(double amount);
}
