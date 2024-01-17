package com.example.hotelmanagementsystem.startegy;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.models.Room;

import java.util.ArrayList;
import java.util.List;


public class RandomRoomAssignmentStrategy implements RoomAssignmentStrategy{
    @Override
    public List<Room> assignRooms(List<Room> availableRooms, int numOfRoomsRequired, BookingRequestDTO booking) {
        List<Room>bookedRooms=new ArrayList<>();
        for(int i=0;i<numOfRoomsRequired;i++){
            Room room= availableRooms.get(i);
            room.setCheckIn(booking.getCheckInDate());
            room.setCheckout(booking.getCheckOutDate());
            bookedRooms.add(room);
        }
        return bookedRooms;
    }
}
