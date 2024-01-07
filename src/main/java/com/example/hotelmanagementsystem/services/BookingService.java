package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.dto.BookingResponseDTO;
import com.example.hotelmanagementsystem.models.Booking;

import java.util.UUID;

public interface BookingService {

    BookingResponseDTO createBooking(int customerId, BookingRequestDTO booking);
    Booking getBooking(UUID id);
}
