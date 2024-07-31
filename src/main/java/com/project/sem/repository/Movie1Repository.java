package com.project.sem.repository;

import com.project.sem.entity.Movie1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie1Repository extends JpaRepository<Movie1, Long> {
}
