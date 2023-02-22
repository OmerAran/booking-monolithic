package com.omeraran.booking.service;

import com.omeraran.booking.dto.MovieDto;
import com.omeraran.booking.dto.converter.MovieDtoConverter;
import com.omeraran.booking.model.Movie;
import com.omeraran.booking.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final MovieDtoConverter movieDtoConverter;

    public MovieService(MovieRepository movieRepository, MovieDtoConverter movieDtoConverter) {
        this.movieRepository = movieRepository;
        this.movieDtoConverter = movieDtoConverter;
    }

    public MovieDto getOneMovie(Long id){
        Movie movie = movieRepository.findById(id).orElseThrow(()->new RuntimeException());
        MovieDto response = movieDtoConverter.convert(movie);
        return response;
    }

    public List<MovieDto> getAllMovies(){
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> response = movies.stream().map(movieDtoConverter::convert).collect(Collectors.toList());
        return response;
    }

    public MovieDto saveOneMovie(Movie movie){
        Movie newMovie = movieRepository.save(movie);
        MovieDto response = movieDtoConverter.convert(newMovie);
        return response;
    }

    public MovieDto updateOneMovie(Movie updateMovie){
        Movie movie = movieRepository.findById(updateMovie.getId()).orElseThrow(()->new RuntimeException());
        movie.setName(updateMovie.getName());
        movie.setImageUrl(updateMovie.getImageUrl());
        Movie savedMovie = movieRepository.save(movie);
        MovieDto response = movieDtoConverter.convert(savedMovie);
        return response;
    }

    public void deleteOneMovie(Long id){
        movieRepository.deleteById(id);
    }

}
