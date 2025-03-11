package com.house4lease.hms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable Integer id){
        return roomService.selectRoom(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Room not found"));
    }



}
