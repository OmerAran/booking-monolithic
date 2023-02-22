package com.omeraran.booking.dto;


public class MovieDto {

    private Long id;
    private String name;
    private String imageUrl;
    private MovieBookingDto movieBookingDto;

    public MovieDto(Long id, String name, String imageUrl, MovieBookingDto movieBookingDto) {
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

    public MovieBookingDto getMovieBookingDto() {
        return movieBookingDto;
    }

    public void setMovieBookingDto(MovieBookingDto movieBookingDto) {
        this.movieBookingDto = movieBookingDto;
    }
}
