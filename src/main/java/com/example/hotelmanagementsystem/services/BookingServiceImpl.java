package com.example.hotelmanagementsystem.services;

import com.example.hotelmanagementsystem.dto.BookingRequestDTO;
import com.example.hotelmanagementsystem.dto.BookingResponseDTO;
import com.example.hotelmanagementsystem.dto.RoomInquiry;
import com.example.hotelmanagementsystem.exceptions.RoomsNotAvailableException;
import com.example.hotelmanagementsystem.models.Booking;
import com.example.hotelmanagementsystem.models.Customer;
import com.example.hotelmanagementsystem.models.Room;
import com.example.hotelmanagementsystem.repository.BookingRepository;
import com.example.hotelmanagementsystem.startegy.RandomRoomAssignmentStrategy;
import com.example.hotelmanagementsystem.startegy.RoomAssignmentStrategy;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService
{
    BookingRepository bookingRepository;
    RoomService roomService;
    CustomerService customerService;
    ModelMapper modelMapper;
    RoomAssignmentStrategy roomAssignmentStrategy;
    public BookingServiceImpl(BookingRepository bookingRepository, RoomService roomService, CustomerService customerService, ModelMapper modelMapper){
        this.bookingRepository=bookingRepository;
        this.roomService=roomService;
        this.customerService=customerService;
        this.modelMapper=modelMapper;
        this.roomAssignmentStrategy=new RandomRoomAssignmentStrategy();
    }
    @Transactional
    public BookingResponseDTO createBooking(int customerId, BookingRequestDTO booking) {
        List<RoomInquiry> roomInquiries=booking.getRoomInquiryList();
        List<Room>bookedRooms;
        Booking savebooking=null;
        Customer customer=customerService.getCustomer(customerId);
        for(RoomInquiry inquiry:roomInquiries){
            List<Room>availableRooms=roomService.availableRoomsOnCriteria(inquiry.getRoomType(),booking.getCheckInDate(),booking.getCheckOutDate());
            if(availableRooms.size()< inquiry.getNumofRooms()){
                throw new RoomsNotAvailableException(inquiry.getRoomType(),booking.getCheckInDate(),booking.getCheckOutDate());
            }
            else{
                bookedRooms=roomAssignmentStrategy.assignRooms(availableRooms,inquiry.getNumofRooms(),booking);
            }
            savebooking=Booking.builder().customer(customer).room(bookedRooms).build();
            bookingRepository.save(savebooking);
        }
        return modelMapper.map(savebooking,BookingResponseDTO.class);
    }

    public Booking getBooking(UUID id){
        return bookingRepository.findById(id).get();
    }
}
