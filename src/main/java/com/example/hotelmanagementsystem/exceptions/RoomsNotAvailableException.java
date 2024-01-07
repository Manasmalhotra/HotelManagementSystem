package com.example.hotelmanagementsystem.exceptions;

import com.example.hotelmanagementsystem.dto.BookingResponseDTO;
import com.example.hotelmanagementsystem.models.RoomType;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public class RoomsNotAvailableException extends RuntimeException{
    public RoomsNotAvailableException(RoomType roomType, Date checkInDate, Date checkOutDate) {
        super("Room not available for "+roomType.toString()+checkInDate.toString()+checkOutDate.toString());
    }
}
