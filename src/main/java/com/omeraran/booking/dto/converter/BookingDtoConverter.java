package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.BookingDto;
import com.omeraran.booking.model.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingDtoConverter {
    private final BookingMovieDtoConverter bookingMovieDtoConverter;
    private final BookingClientDtoConverter bookingClientDtoConverter;

    public BookingDtoConverter(BookingMovieDtoConverter bookingMovieDtoConverter, BookingClientDtoConverter bookingClientDtoConverter) {
        this.bookingMovieDtoConverter = bookingMovieDtoConverter;
        this.bookingClientDtoConverter = bookingClientDtoConverter;
    }

    public BookingDto convert(Booking from){
        return new BookingDto(
                from.getId(),
                bookingClientDtoConverter.convert(from.getClient()),
                bookingMovieDtoConverter.convert(from.getMovie())
        );
    }
}
