package com.example.hotelmanagementsystem.dto;

import com.example.hotelmanagementsystem.models.RoomType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomInquiry {
    int numofRooms;
    RoomType roomType;
}
