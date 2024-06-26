package com.cydeo.controller;

import com.cydeo.entity.MovieCinema;
import com.cydeo.repository.GenreRepository;
import com.cydeo.repository.MovieCinemaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ConsumeWebClient {

    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;


    public ConsumeWebClient(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }


@GetMapping("/flux-movie-cinemas")
public Flux<MovieCinema> readAllCinemaFlux(){

        return Flux.fromIterable((Iterable<? extends MovieCinema>) movieCinemaRepository.findAll());
}

    @GetMapping("/mono-movie-cinema/{id}")
    public ResponseEntity<Mono<MovieCinema>> readById(@PathVariable("id") Long id){

        return ResponseEntity.ok(Mono.just(movieCinemaRepository.findById(id).get()));

    }

}
