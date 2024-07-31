package com.project.sem.service;

import com.project.sem.entity.*;
import com.project.sem.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private Movie1Repository movie1Repository;
    @Autowired
    private Movie2Repository movie2Repository;
    @Autowired
    private Movie3Repository movie3Repository;
    @Autowired
    private Movie4Repository movie4Repository;
    @Autowired
    private Movie5Repository movie5Repository;
    @Autowired
    private Movie6Repository movie6Repository;
    @Autowired
    private Movie7Repository movie7Repository;
    @Autowired
    private Movie8Repository movie8Repository;

    public Movie1 saveMovie1(Movie1 movie) {
        return movie1Repository.save(movie);
    }

    public List<Movie1> getAllMovies1() {
        return movie1Repository.findAll();
    }

    public Movie2 saveMovie2(Movie2 movie) {
        return movie2Repository.save(movie);
    }

    public List<Movie2> getAllMovies2() {
        return movie2Repository.findAll();
    }

    public Movie3 saveMovie3(Movie3 movie) {
        return movie3Repository.save(movie);
    }

    public List<Movie3> getAllMovies3() {
        return movie3Repository.findAll();
    }

    public Movie4 saveMovie4(Movie4 movie) {
        return movie4Repository.save(movie);
    }

    public List<Movie4> getAllMovies4() {
        return movie4Repository.findAll();
    }

    public Movie5 saveMovie5(Movie5 movie) {
        return movie5Repository.save(movie);
    }

    public List<Movie5> getAllMovies5() {
        return movie5Repository.findAll();
    }

    public Movie6 saveMovie6(Movie6 movie) {
        return movie6Repository.save(movie);
    }

    public List<Movie6> getAllMovies6() {
        return movie6Repository.findAll();
    }

    public Movie7 saveMovie7(Movie7 movie) {
        return movie7Repository.save(movie);
    }

    public List<Movie7> getAllMovies7() {
        return movie7Repository.findAll();
    }

    public Movie8 saveMovie8(Movie8 movie) {
        return movie8Repository.save(movie);
    }

    public List<Movie8> getAllMovies8() {
        return movie8Repository.findAll();
    }
}
