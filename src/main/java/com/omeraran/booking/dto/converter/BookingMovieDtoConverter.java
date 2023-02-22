package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.BookingMovieDto;
import com.omeraran.booking.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class BookingMovieDtoConverter {

    public BookingMovieDto convert(Movie from){
        return new BookingMovieDto(
            from.getId(),
            from.getName(),
            from.getImageUrl()
        );
    }
}
