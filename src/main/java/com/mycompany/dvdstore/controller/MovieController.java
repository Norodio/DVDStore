package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private final MovieService movieService = new MovieService();

    public void addUsingConsole() {
        System.out.println("What is the movie name ?");
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        System.out.println("What is the movie genre ?");
        String movieGenre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieName);
        movie.setGenre(movieGenre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
