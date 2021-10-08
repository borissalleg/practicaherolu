package com.cine.cinema.repository;

import com.cine.cinema.model.PeliculaModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<PeliculaModel, Integer> {
    
}
