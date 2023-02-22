package com.omeraran.booking.controller;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.dto.UserDto;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.model.User;
import com.omeraran.booking.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDto getClient(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping()
    public UserDto saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
