package com.example.hotelbookingassignment.repository;


import com.example.hotelbookingassignment.ds.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface RoomRepository extends CrudRepository<Room, UUID> {

    Set<Room> findAll();

    Optional<Room> findByName(String name);
}
