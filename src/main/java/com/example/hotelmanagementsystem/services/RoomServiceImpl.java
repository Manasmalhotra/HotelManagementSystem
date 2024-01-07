package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.Room;
import com.example.hotelmanagementsystem.models.RoomType;
import com.example.hotelmanagementsystem.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{
    RoomRepository roomRepository;
    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository=roomRepository;
    }
    public List<Room> availableRoomsOnCriteria(RoomType roomType, Date checkin, Date checkout) {
        return roomRepository.findRoomsByCheckInEmptyOrCheckoutBefore(checkout);
    }

    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }
}
