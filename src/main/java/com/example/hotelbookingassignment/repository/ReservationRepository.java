package com.example.hotelbookingassignment.repository;

import com.example.hotelbookingassignment.ds.Reservation;
import com.example.hotelbookingassignment.ds.Room;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public interface ReservationRepository extends CrudRepository<Reservation, UUID> {

    Set<Reservation> findAllByReservationDate(LocalDate reservationDate);

    boolean existsByRoomAndReservationDate(Room room, LocalDate reservationDate);
}
