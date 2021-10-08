package com.cine.cinema.services;

import java.util.List;

import com.cine.cinema.model.PeliculaModel;
import com.cine.cinema.repository.PeliculasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class PeliculasService {

  @Autowired
  public PeliculasRepository pelicula;

  public List<PeliculaModel> listar() {
    return (List<PeliculaModel>) pelicula.findAll();

  }

}
