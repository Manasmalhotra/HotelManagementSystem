package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BillServiceImpl implements BillService{
    BookingService bookingService;
    PaymentService paymentService;
    public BillServiceImpl(BookingService bookingService,PaymentService paymentService){
        this.bookingService=bookingService;
        this.paymentService=paymentService;
    }
    public Bill generateBill(UUID bookingId) {
        Booking booking=bookingService.getBooking(bookingId);
        List<Room>rooms=booking.getRoom();
        double amount=0;
        for(Room room: rooms){
            amount+=room.getFarePerNight();
        }
        Date checkInDate=booking.getRoom().get(0).getCheckIn();
        Date checkOutDate=booking.getRoom().get(0).getCheckout();
        long timeDifferenceInMillis = checkInDate.getTime() - checkOutDate.getTime();
        long days = timeDifferenceInMillis / (24 * 60 * 60 * 1000);
        amount*=days;
        List<Payment>payments=new ArrayList<>();
        Payment payment=paymentService.getPayment(amount);
        payments.add(payment);
        return Bill.builder().billStatus(BillStatus.PAID).payments(payments).amount(amount).build();
    }
}
