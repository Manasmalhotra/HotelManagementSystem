package com.example.hotelmanagementsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity(name="room")
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    RoomType type;
    int floorNo;
    Date checkIn;
    Date checkout;
    double farePerNight;
}
