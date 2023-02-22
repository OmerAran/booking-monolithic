package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.ClientBookingDto;
import com.omeraran.booking.model.Booking;
import org.springframework.stereotype.Component;

@Component
public class ClientBookingDtoConverter {

    private final ClientMovieDtoConverter clientMovieDtoConverter;

    public ClientBookingDtoConverter(ClientMovieDtoConverter clientMovieDtoConverter) {
        this.clientMovieDtoConverter = clientMovieDtoConverter;
    }

    public ClientBookingDto convert(Booking from){
        return new ClientBookingDto(
                from.getId(),
                clientMovieDtoConverter.convert(from.getMovie())
        );
    }
}
