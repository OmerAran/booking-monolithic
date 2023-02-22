package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.BookingClientDto;
import com.omeraran.booking.model.Client;
import org.springframework.stereotype.Component;

@Component
public class BookingClientDtoConverter {

    public BookingClientDto convert(Client from){
        return new BookingClientDto(
                from.getId(),
                from.getUsername(),
                from.getFirstName(),
                from.getLastName(),
                from.getDateOfBirth()
        );
    }
}
