package com.omeraran.booking.controller;

import com.omeraran.booking.dto.MovieDto;
import com.omeraran.booking.model.Movie;
import com.omeraran.booking.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/{id}")
    public MovieDto getMovie(@PathVariable Long id){
        return movieService.getOneMovie(id);
    }

    @GetMapping()
    public List<MovieDto> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping()
    public MovieDto saveMovie(@RequestBody Movie movie){
        return movieService.saveOneMovie(movie);
    }

    @PutMapping()
    public MovieDto updateMovie(@RequestBody Movie movie){
        return movieService.updateOneMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteOneMovie(@PathVariable Long id){
        movieService.deleteOneMovie(id);
    }
}
