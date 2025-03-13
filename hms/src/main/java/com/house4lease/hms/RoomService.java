package com.house4lease.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

// The purpose of Service is to create a function connection
// between Repo and Controller
// Only contains function -> not storing any data
@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Optional<Room> selectRoom(Integer room_number){
        return roomRepo.findRoomByRoomNumber((room_number));
    }

    public Optional<Room> updateRoomInfo(RoomUpdateDTO roomDTO) {
        Query query = new Query(Criteria.where("roomNumber").is(roomDTO.getRoomNumber()));

        Update update = new Update()
                .set("price", roomDTO.getPrice())
                .set("size", roomDTO.getSize())
                .set("avail", roomDTO.getAvail())
                .set("picture", roomDTO.getPicture());

        mongoTemplate.updateFirst(query, update, Room.class);

        Room updatedRoom = mongoTemplate.findOne(query, Room.class);
        return Optional.ofNullable(updatedRoom);
    }
}
