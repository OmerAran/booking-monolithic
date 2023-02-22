package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.AdminDto;
import com.omeraran.booking.model.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminDtoConverter {

    public AdminDto convert(Admin from){
        return new AdminDto(
                from.getId(),
                from.getUsername(),
                from.getFirstName(),
                from.getLastName(),
                from.getEmail(),
                from.getPassword(),
                from.getDateOfBirth(),
                from.getAdminKey()
        );
    }
}
