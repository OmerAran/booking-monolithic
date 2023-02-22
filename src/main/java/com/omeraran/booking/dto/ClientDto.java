package com.omeraran.booking.dto;

import java.util.Date;
import java.util.Set;

public class ClientDto {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Set<BookingDto> bookingDtos;

    public ClientDto(Long id, String username, String firstName, String lastName, Date dateOfBirth, Set<BookingDto> bookingDtos) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bookingDtos = bookingDtos;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<BookingDto> getBookingDtos() {
        return bookingDtos;
    }

    public void setBookingDtos(Set<BookingDto> bookingDtos) {
        this.bookingDtos = bookingDtos;
    }
}
