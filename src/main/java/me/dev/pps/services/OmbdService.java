package me.dev.pps.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import me.dev.pps.model.Film;

@FeignClient(name = "ombd", url = "https://www.omdbapi.com")
public interface OmbdService {

    @GetMapping("/")
    Film findFilm(@RequestParam("apikey") String apikey, @RequestParam("t") String title);

}
