/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter9.jdbc;

import com.turing.javase4thbatch.chapter9.jdbc.model.Actor;
import com.turing.javase4thbatch.chapter9.jdbc.model.Movie;
import java.util.List;

/**
 *
 * @author macbook
 */
public interface MovieDAO {
    List<Movie> getAllMovie();
    List<Movie> getMovieById(String id);
    boolean addMovie(Movie movie);
    boolean updateMovie(Movie movie);
    boolean deleteMovieById(Long id);
    List<Actor> getActorsInMovie(Long movieId);
}
