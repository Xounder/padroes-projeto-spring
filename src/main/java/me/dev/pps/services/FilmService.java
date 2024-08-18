package me.dev.pps.services;

import org.springframework.stereotype.Service;

import me.dev.pps.model.Film;

@Service
public interface FilmService {
    
    Iterable<Film> findAll();
    
    Film findByTitle(String title);

    void insert(Film film);

    void insertByTitle(String title);

    void update(Film film);

    void deleteByTitle(String title);
}
