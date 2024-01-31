package com.example.hotelbookingassignment.service;

import com.example.hotelbookingassignment.ds.Guest;
import com.example.hotelbookingassignment.ds.Reservation;
import com.example.hotelbookingassignment.ds.Room;
import com.example.hotelbookingassignment.repository.ReservationRepository;
import com.example.hotelbookingassignment.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Sets;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private RoomRepository roomRepository;

    public Optional<Room> findAvailableRoom(LocalDate date) {
        return null;
    }

    public Optional<Reservation> bookRoom(String roomName, Guest guest, LocalDate date) {
        return null;
    }

    public Optional<Reservation> bookRoom(Room room, Guest guest, LocalDate date) {
        return null;
    }

    private boolean isRoomAvailableAtDate(Room room, LocalDate date) {
        return false;
    }
}
