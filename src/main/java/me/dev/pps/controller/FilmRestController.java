package me.dev.pps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dev.pps.model.Film;
import me.dev.pps.services.FilmService;

@RestController
@RequestMapping("films")
public class FilmRestController {
    @Autowired
    private FilmService filmService;

    @GetMapping
    public ResponseEntity<Iterable<Film>> findAll(){
        return ResponseEntity.ok(filmService.findAll());
    }

    @GetMapping("/{title}")
    public ResponseEntity<Film> findByTitle(@PathVariable String title){
        return ResponseEntity.ok(filmService.findByTitle(title));
    }

    @PostMapping("/{title}")
    public ResponseEntity<Film> insertByTitle(@PathVariable String title){
        filmService.insertByTitle(title);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteByTitle(@PathVariable String title){
        filmService.deleteByTitle(title);
        return ResponseEntity.ok().build();
    }
    
}
