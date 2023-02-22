package com.omeraran.booking.dto;

public class MovieBookingDto {
    private Long id;
    private BookingClientDto bookingClientDto;

    public MovieBookingDto(Long id, BookingClientDto bookingClientDto) {
        this.id = id;
        this.bookingClientDto = bookingClientDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BookingClientDto getBookingClientDto() {
        return bookingClientDto;
    }

    public void setBookingClientDto(BookingClientDto bookingClientDto) {
        this.bookingClientDto = bookingClientDto;
    }
}
