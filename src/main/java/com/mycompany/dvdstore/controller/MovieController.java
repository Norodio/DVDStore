package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        System.out.println("What is the movie name ?");
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        System.out.println("What is the movie genre ?");
        String movieGenre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieName);
        movie.setGenre(movieGenre);
        movieService.registerMovie(movie);
    }
}
