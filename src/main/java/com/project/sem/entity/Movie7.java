package com.project.sem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies7")
public class Movie7 {

    @Id
    private Long ID;
    private String Title;
    private String Overview;
    private String PosterPath;
    private String YouTubeTrailer;
    private String ReleaseDate;
    private Double Popularity;
    private Double VoteAverage;
    private Integer VoteCount;
    private Long Budget;
    private Long Revenue;
    private Integer Runtime;
    private String Tagline;
    private String Genres;
    private String Cast;
    private String Crew;
    private String BackdropPath;
    private String ProductionCompanies;
    private String ProductionCountries;
    private String Keywords;
    @Column(name = "reviews", length = 500)  // Adjust length if needed
    private String reviews;


    // Getters and setters
    // ...
}
