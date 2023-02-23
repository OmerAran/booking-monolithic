package com.omeraran.booking.dto;


import java.util.Set;

public class MovieDto {

    private Long id;
    private String name;
    private String imageUrl;
    private Set<MovieBookingDto> movieBookingDto;

    public MovieDto(Long id, String name, String imageUrl, Set<MovieBookingDto> movieBookingDto) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.movieBookingDto = movieBookingDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Set<MovieBookingDto> getMovieBookingDto() {
        return movieBookingDto;
    }

    public void setMovieBookingDto(Set<MovieBookingDto> movieBookingDto) {
        this.movieBookingDto = movieBookingDto;
    }
}
