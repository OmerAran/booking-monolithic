package com.omeraran.booking.dto.converter;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.model.Client;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ClientDtoConverter {
    private final ClientBookingDtoConverter clientBookingDtoConverter;

    public ClientDtoConverter(ClientBookingDtoConverter clientBookingDtoConverter) {
        this.clientBookingDtoConverter = clientBookingDtoConverter;
    }

    public ClientDto convert(Client from){
        return new ClientDto(
                from.getId(),
                from.getUsername(),
                from.getFirstName(),
                from.getLastName(),
                from.getDateOfBirth(),
                from.getBooking().stream().map(clientBookingDtoConverter::convert).collect(Collectors.toSet())
                );
    }
}
