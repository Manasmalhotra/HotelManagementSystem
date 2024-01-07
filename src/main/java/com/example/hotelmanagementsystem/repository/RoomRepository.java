package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Integer> {
    List<Room> findRoomsByCheckInEmptyOrCheckoutBefore(Date checkoutdate);
}
