package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.dto.BookingResponseDTO;
import com.example.hotelmanagementsystem.models.Booking;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BookingService {

    BookingResponseDTO createBooking(int customerId, BookingRequestDTO booking);
    public Booking getBooking(UUID id);
}
