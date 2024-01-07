package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
