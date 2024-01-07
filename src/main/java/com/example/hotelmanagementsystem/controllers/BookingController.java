package com.example.hotelmanagementsystem.controllers;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.dto.BookingResponseDTO;
import com.example.hotelmanagementsystem.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController
{
    BookingService bookingService;
    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }
     @PostMapping("/{customerId}")
     public ResponseEntity<BookingResponseDTO> createBooking(@PathVariable int customerId, @RequestBody BookingRequestDTO booking) {
        return ResponseEntity.ok(bookingService.createBooking(customerId,booking));
     }
}
