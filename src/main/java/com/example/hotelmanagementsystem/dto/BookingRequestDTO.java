package com.example.hotelmanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class BookingRequestDTO {
        List<RoomInquiry> roomInquiryList;
        Date checkInDate;
        Date checkOutDate;
}
