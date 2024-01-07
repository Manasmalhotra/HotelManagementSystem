package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Bill;

import java.util.UUID;

public interface BillService {
    Bill generateBill(UUID bookingId);
}
