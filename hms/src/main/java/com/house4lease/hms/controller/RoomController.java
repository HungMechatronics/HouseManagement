package com.house4lease.hms.controller;

import com.house4lease.hms.entity.Room;
import com.house4lease.hms.service.RoomService;
import com.house4lease.hms.dataObject.RoomUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // add path variable when choose room number
    @GetMapping("/{number}")
    public Room getRoom(@PathVariable Integer number){
        return roomService.selectRoom(number)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Room not found"));
    }

    // This function created to update info of existed room
    @PostMapping
    public ResponseEntity<Optional<Room>> updateRoom(@RequestBody @Validated RoomUpdateDTO userDTO) {
        Optional<Room> room = roomService.updateRoomInfo(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body(room);
    }
}
