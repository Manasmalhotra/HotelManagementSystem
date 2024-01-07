package com.example.hotelmanagementsystem.dto;

import com.example.hotelmanagementsystem.models.BookingStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class BookingResponseDTO {
    UUID id;
    BookingStatus bookingStatus;
    int numofRooms;
    List<RoomDTO> rooms;
    String customerName;
    Date checkInDate;
    Date checkOutDate;
}
