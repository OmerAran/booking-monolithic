package com.omeraran.booking.controller;

import com.omeraran.booking.dto.BookingDto;
import com.omeraran.booking.model.Booking;
import com.omeraran.booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/{id}")
    public BookingDto getBooking(@PathVariable Long id){
        return bookingService.getOneBooking(id);
    }

    @GetMapping()
    public List<BookingDto> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @PostMapping()
    public BookingDto saveBooking(@RequestBody Booking booking){
        return bookingService.saveOneBooking(booking);
    }

    @PutMapping()
    public BookingDto updateBooking(@RequestBody Booking booking){
        return bookingService.updateOneBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteOneBooking(@PathVariable Long id){
        bookingService.deleteOneBooking(id);
    }
}
