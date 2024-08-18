package me.dev.pps.services.impl;

import java.util.Optional;

//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dev.pps.model.Film;
import me.dev.pps.model.FilmRepository;
import me.dev.pps.services.FilmService;
import me.dev.pps.services.OmbdService;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private OmbdService ombdService;

    @Override
    public Iterable<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film findByTitle(String title) {
        Optional<Film> film = filmRepository.findById(title);
        return film.get();
    }

    @Override
    public void insert(Film film) {
        if (!filmExists(film.getTitle())){
            filmRepository.save(film);
        }
    }

    @Override
    public void insertByTitle(String title) {
        if (!filmExists(title)){
            Film film = ombdService.findFilm("6cf6667", title);
            //LoggerFactory.getLogger("Check: ").info("Filme ---- " + film);
            filmRepository.save(film);
        }
    }

    @Override
    public void update(Film film) {
        if (filmExists(film.getTitle())){
            filmRepository.save(film);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        if (filmExists(title)){
            filmRepository.deleteById(title);
        }
    }

    private boolean filmExists(String title){
        return filmRepository.findById(title).isPresent();
    }
    
}
