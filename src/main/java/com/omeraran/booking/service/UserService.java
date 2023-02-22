package com.omeraran.booking.service;


import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.dto.UserDto;
import com.omeraran.booking.dto.converter.UserDtoConverter;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.model.User;
import com.omeraran.booking.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    private final UserRepository userRepository;
    private final UserDtoConverter converter;

    public UserService(UserRepository userRepository, UserDtoConverter converter) {
        this.userRepository = userRepository;
        this.converter = converter;
    }

    public UserDto getUser(Long id){
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("message will be added"));
        UserDto userDto = converter.convert(user);
        return userDto;
    }

    public UserDto saveUser(User newUser) {
        User user = userRepository.save(newUser);
        return converter.convert(user);
    }
}
