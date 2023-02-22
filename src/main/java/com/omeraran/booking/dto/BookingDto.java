package com.omeraran.booking.dto;

public class BookingDto {
    private Long id;

    public BookingDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
