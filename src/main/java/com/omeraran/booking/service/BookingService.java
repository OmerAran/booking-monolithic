package com.omeraran.booking.service;

import com.omeraran.booking.dto.BookingDto;
import com.omeraran.booking.dto.converter.BookingDtoConverter;
import com.omeraran.booking.model.Booking;
import com.omeraran.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final BookingDtoConverter bookingDtoConverter;

    public BookingService(BookingRepository bookingRepository, BookingDtoConverter bookingDtoConverter) {
        this.bookingRepository = bookingRepository;
        this.bookingDtoConverter = bookingDtoConverter;
    }

    public BookingDto getOneBooking(Long id){
        Booking Booking = bookingRepository.findById(id).orElseThrow(()->new RuntimeException());
        BookingDto response = bookingDtoConverter.convert(Booking);
        return response;
    }

    public List<BookingDto> getAllBookings(){
        List<Booking> movies = bookingRepository.findAll();
        List<BookingDto> response = movies.stream().map(bookingDtoConverter::convert).collect(Collectors.toList());
        return response;
    }

    public BookingDto saveOneBooking(Booking booking){
        Booking newBooking = bookingRepository.save(booking);
        BookingDto response = bookingDtoConverter.convert(newBooking);
        return response;
    }

    public BookingDto updateOneBooking(Booking updateBooking){
        Booking Booking = bookingRepository.findById(updateBooking.getId()).orElseThrow(()->new RuntimeException());
        Booking.setMovie(updateBooking.getMovie());
        Booking.setClient(updateBooking.getClient());
        Booking savedMovie = bookingRepository.save(Booking);
        BookingDto response = bookingDtoConverter.convert(savedMovie);
        return response;
    }

    public void deleteOneBooking(Long id){
        bookingRepository.deleteById(id);
    }
    
}
