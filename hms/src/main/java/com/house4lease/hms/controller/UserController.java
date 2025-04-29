package com.house4lease.hms.controller;

import com.house4lease.hms.entity.User;
import com.house4lease.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
    @GetMapping(path = "/login/{pNumber}~{password}")
    public ResponseEntity<User> getUserLogin(@PathVariable Integer pNumber, @PathVariable String password){
        Optional<User> user = userService.selectUserByLogin(pNumber, password);

        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
