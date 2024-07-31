package com.project.sem.controller;

import com.project.sem.entity.*;

import com.project.sem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")

public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/1")
    public Movie1 addMovie1(@RequestBody Movie1 movie) {
        return movieService.saveMovie1(movie);
    }

    @GetMapping("/1")
    public List<Movie1> getAllMovies1() {
        return movieService.getAllMovies1();
    }

    @PostMapping("/2")
    public Movie2 addMovie2(@RequestBody Movie2 movie) {
        return movieService.saveMovie2(movie);
    }

    @GetMapping("/2")
    public List<Movie2> getAllMovies2() {
        return movieService.getAllMovies2();
    }
    @PostMapping("/3")
    public Movie3 addMovie3(@RequestBody Movie3 movie) {
        return movieService.saveMovie3(movie);
    }

    @GetMapping("/3")
    public List<Movie3> getAllMovies3() {
        return movieService.getAllMovies3();
    }
    @PostMapping("/4")
    public Movie4 addMovie4(@RequestBody Movie4 movie) {
        return movieService.saveMovie4(movie);
    }

    @GetMapping("/4")
    public List<Movie4> getAllMovies4() {
        return movieService.getAllMovies4();
    }
    @PostMapping("/5")
    public Movie5 addMovie5(@RequestBody Movie5 movie) {
        return movieService.saveMovie5(movie);
    }

    @GetMapping("/5")
    public List<Movie5> getAllMovies5() {
        return movieService.getAllMovies5();
    }
    @PostMapping("/6")
    public Movie6 addMovie6(@RequestBody Movie6 movie) {
        return movieService.saveMovie6(movie);
    }

    @GetMapping("/6")
    public List<Movie6> getAllMovies6() {
        return movieService.getAllMovies6();
    }
    @PostMapping("/7")
    public Movie7 addMovie7(@RequestBody Movie7 movie) {
        return movieService.saveMovie7(movie);
    }

    @GetMapping("/7")
    public List<Movie7> getAllMovies7() {
        return movieService.getAllMovies7();
    }
    @PostMapping("/8")
    public Movie8 addMovie8(@RequestBody Movie8 movie) {
        return movieService.saveMovie8(movie);
    }

    @GetMapping("/8")
    public List<Movie8> getAllMovies8() {
        return movieService.getAllMovies8();
    }
}
