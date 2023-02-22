package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.BookingDto;
import com.omeraran.booking.model.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingDtoConverter {

    public BookingDto convert(Booking from){
        return new BookingDto(
          from.getId()
        );
    }
}
