package com.example.hotelbookingassignment.service;

import com.example.hotelbookingassignment.ds.BookingResult;
import com.example.hotelbookingassignment.ds.Guest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class ApplicationService {

    @Autowired
    private GuestRegistrationService guestRegistrationService;
    @Autowired
    private BookingService bookingService;

    public BookingResult bookAnyRoomForNewGuest(String firstName, String lastName, LocalDate date) {
        return null;
    }

    public Guest registerGuest(String firstName, String lastName) {
        return null;
    }

    public BookingResult bookAnyRoomForRegisteredGuest(Guest guest, LocalDate date) {
        return null;
    }

    public BookingResult bookSpecificRoomForRegisteredGuest(Guest guest, String roomName, LocalDate date) {
       return null;
    }
}
