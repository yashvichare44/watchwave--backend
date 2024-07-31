package com.project.sem.repository;

import com.project.sem.entity.Movie3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie3Repository extends JpaRepository<Movie3, Long> {
}
