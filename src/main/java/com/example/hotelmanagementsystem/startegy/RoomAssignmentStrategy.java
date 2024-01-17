package com.example.hotelmanagementsystem.startegy;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.models.Room;

import java.util.List;

public interface RoomAssignmentStrategy {
    List<Room> assignRooms(List<Room>availableRooms, int numOfRoomsRequired, BookingRequestDTO booking);
}
