package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Room;
import com.example.hotelmanagementsystem.models.RoomType;

import java.util.Date;
import java.util.List;

public interface RoomService {
    List<Room> availableRoomsOnCriteria(RoomType roomType, Date checkin,Date checkout);
    Room saveRoom(Room room);
}
