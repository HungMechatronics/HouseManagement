package com.house4lease.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

// The purpose of Service is to create a function connection
// between Repo and Controller
// Only contains function -> not storing any data
@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepo;

    public Optional<Room> selectRoom(Integer room_number){
        return roomRepo.findRoomByRoomNumber((room_number));
    }
}
