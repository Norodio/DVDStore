package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("What is the movie name ?");
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        System.out.println("What is the movie genre ?");
        Scanner sc2 = new Scanner(System.in);
        String movieGenre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(movieName);
        movie.setGenre(movieGenre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
