package com.project.sem.repository;

import com.project.sem.entity.Movie2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie2Repository extends JpaRepository<Movie2, Long> {
}
