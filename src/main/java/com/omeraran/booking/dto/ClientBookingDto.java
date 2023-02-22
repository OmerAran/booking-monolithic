package com.omeraran.booking.dto;

public class ClientBookingDto {
    
    private Long id;
    private ClientMovieDto clientMovieDto;

    public ClientBookingDto(Long id, ClientMovieDto clientMovieDto) {
        this.id = id;
        this.clientMovieDto = clientMovieDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientMovieDto getClientMovieDto() {
        return clientMovieDto;
    }

    public void setClientMovieDto(ClientMovieDto clientMovieDto) {
        this.clientMovieDto = clientMovieDto;
    }
}
