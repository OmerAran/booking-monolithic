package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.ClientMovieDto;
import com.omeraran.booking.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class ClientMovieDtoConverter {

    public ClientMovieDto convert(Movie from){
        return new ClientMovieDto(
          from.getId(),
          from.getName(),
          from.getImageUrl()
        );
    }
}
