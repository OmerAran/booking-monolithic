package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.MovieBookingDto;
import com.omeraran.booking.dto.MovieDto;
import com.omeraran.booking.model.Booking;
import com.omeraran.booking.model.Movie;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MovieDtoConverter {
    private final MovieBookingConverter movieBookingConverter;

    public MovieDtoConverter(MovieBookingConverter movieBookingConverter) {
        this.movieBookingConverter = movieBookingConverter;
    }

    public MovieDto convert(Movie from){
      return new MovieDto(
              from.getId(),
              from.getName(),
              from.getImageUrl(),
              getBookings(from.getBooking())
              );
    }

    private Set<MovieBookingDto> getBookings(Set<Booking> bookings) {
        return Objects.isNull(bookings) ? Collections.emptySet() : bookings.stream().map(movieBookingConverter::convert).collect(Collectors.toSet());
    }
}
