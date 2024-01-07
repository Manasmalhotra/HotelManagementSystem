package com.example.hotelmanagementsystem.controllers;

import com.example.hotelmanagementsystem.models.Bill;
import com.example.hotelmanagementsystem.services.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("{bookingId}/bill")
public class BillController {
    BillService billService;
    public BillController(BillService billService){
        this.billService=billService;
    }
    @PostMapping
    public ResponseEntity<Bill>generateBill(@PathVariable UUID bookingId){
        return ResponseEntity.ok(billService.generateBill(bookingId));
    }
}
