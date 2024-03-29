package com.omeraran.booking.dto;

public class BookingDto {
    private Long id;
    private BookingClientDto bookingClientDto;
    private BookingMovieDto bookingMovieDto;

    public BookingDto(Long id, BookingClientDto bookingClientDto, BookingMovieDto bookingMovieDto) {
        this.id = id;
        this.bookingClientDto = bookingClientDto;
        this.bookingMovieDto = bookingMovieDto;
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

    public BookingMovieDto getBookingMovieDto() {
        return bookingMovieDto;
    }

    public void setBookingMovieDto(BookingMovieDto bookingMovieDto) {
        this.bookingMovieDto = bookingMovieDto;
    }
}
