package com.cine.cinema.controller;

import java.util.List;

import com.cine.cinema.model.PeliculaModel;
import com.cine.cinema.repository.PeliculasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/peliculas")
public class PeliculasController {
    
    @Autowired
    private PeliculasRepository peli;

    @GetMapping(value = "/listar")
    public List<PeliculaModel> listarPeliculas(){
          
        return (List<PeliculaModel>) peli.findAll();
    }

    @PostMapping(value="/guardar")
    public void guardarPeliculas(@RequestBody PeliculaModel pelicula) {
        peli.save(pelicula);
        System.out.println("guardado");
        
    }
    

}
