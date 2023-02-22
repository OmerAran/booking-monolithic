package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.MovieBookingDto;
import com.omeraran.booking.model.Booking;
import org.springframework.stereotype.Component;

@Component
public class MovieBookingConverter {
    private final BookingClientDtoConverter bookingClientDtoConverter;

    public MovieBookingConverter(BookingClientDtoConverter bookingClientDtoConverter) {
        this.bookingClientDtoConverter = bookingClientDtoConverter;
    }

    public MovieBookingDto convert(Booking from){
        if (from == null) {
            return null;
        }
        return new MovieBookingDto(
          from.getId(),
                bookingClientDtoConverter.convert(from.getClient())
        );
    }
}
