package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.UserDto;
import com.omeraran.booking.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public UserDto convert(User from){
        return new UserDto(
                from.getId(),
                from.getUsername(),
                from.getFirstName(),
                from.getLastName(),
                from.getEmail(),
                from.getPassword(),
                from.getDateOfBirth()
        );
    }
}
