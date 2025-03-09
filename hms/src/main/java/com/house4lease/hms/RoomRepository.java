package com.house4lease.hms;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends MongoRepository<Room, ObjectId> {
    // MongoDB will support extracting data
    // the arg must be an attribute of Entity
    Optional<Room> findRoomByRoomNumber(Integer room_number);
}
