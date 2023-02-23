package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.MovieDto;
import com.omeraran.booking.model.Movie;
import org.springframework.stereotype.Component;

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
              from.getBooking().stream().map(movieBookingConverter::convert).collect(Collectors.toSet())
              );
    }
}
