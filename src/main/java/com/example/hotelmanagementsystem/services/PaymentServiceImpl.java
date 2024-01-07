package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Payment;
import com.example.hotelmanagementsystem.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    PaymentRepository paymentRepository;
    public PaymentServiceImpl(PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
    }
    @Override
    public Payment getPayment(double amount) {
        return paymentRepository.save(new Payment());
    }
}
