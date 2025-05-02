package com.house4lease.hms.controller;

import com.house4lease.hms.dataObject.LoginDTO;
import com.house4lease.hms.entity.User;
import com.house4lease.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Get all information from id
    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getUserInfo(@PathVariable Integer id) {
        Optional<User> user = userService.selectUser(id);

        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Get ID from phone number and password
    @PostMapping(path = "/login")
    public ResponseEntity<User> getUserLogin(@RequestBody LoginDTO loginDTO){
        Optional<User> user = userService.selectUserByLogin(loginDTO.getPhoneNumber(), loginDTO.getPassword());

        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
