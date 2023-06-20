/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase4thbatch.chapter9.jdbc;

import com.turing.javase4thbatch.chapter9.jdbc.model.Actor;
import com.turing.javase4thbatch.chapter9.jdbc.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MovieDaoImpl implements MovieDAO{

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> movies = new ArrayList<>();
        Connection con = DAO.getDAO().getConnection();
        
        try(Statement stmt = con.createStatement())
        {
            String sql = "SELECT * FROM movie";
            try(ResultSet result = stmt.executeQuery(sql))
            {
                while(result.next())
                {
                    Movie movie = getMovieFromResultSet(result);
                    
                    movies.add(movie);
                }
            }
            catch(Exception re)
            {
                re.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movies;
    }
    @Override
    public List<Movie> getMovieById(String id) {
        List<Movie> movies = new ArrayList<>();
        Connection con = DAO.getDAO().getConnection();
        
        String sql = "SELECT * FROM movie WHERE id=?";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setString(1, id);
            try(ResultSet result = stmt.executeQuery())
            {
                while(result.next())
                {
                    Movie movie = getMovieFromResultSet(result);
                    
                    movies.add(movie);
                }
            }
            catch(Exception re)
            {
                re.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return movies;
    }

    private Movie getMovieFromResultSet(final ResultSet result) throws SQLException {
        Movie movie = new Movie();
        movie.setId(result.getLong("ID"));
        movie.setName(result.getString("name"));
        movie.setGenre(result.getString("genre"));
        movie.setYear(result.getLong("year"));
        return movie;
    }
    @Override
    public boolean addMovie(Movie movie) {
        int rowCount = 0;
        Connection con = DAO.getDAO().getConnection();
        
        String sql = "INSERT INTO movie(name,genre,year)\n" +
"VALUES(?,?,?);";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setString(1, movie.getName());
            stmt.setString(2, movie.getGenre());
            stmt.setLong(3, movie.getYear());
            
            rowCount = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rowCount > 0;
    }
    @Override
    public boolean updateMovie(Movie movie) {
        int rowCount = 0;
        Connection con = DAO.getDAO().getConnection();
        
        String sql = "UPDATE movie\n" +
                    "set name=?,\n" +
                    "genre=?,\n" +
                    "year =?\n" +
                    "WHERE id=?";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setString(1, movie.getName());
            stmt.setString(2, movie.getGenre());
            stmt.setLong(3, movie.getYear());
            stmt.setLong(4, movie.getId());
            rowCount = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rowCount > 0;
    }
    @Override
    public boolean deleteMovieById(Long id) {
        int rowCount = 0;
        Connection con = DAO.getDAO().getConnection();
        
        String sql = "DELETE FROM Movie WHERE id=?";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1, id);
            rowCount = stmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rowCount > 0;
    }
    @Override
    public List<Actor> getActorsInMovie(Long movieId) {
        List<Actor> actors = new ArrayList<>();
        Connection con = DAO.getDAO().getConnection();
        
        String sql = "SELECT actor.id, actor.name FROM movie\n" +
                        "INNER JOIN actor\n" +
                        "INNER JOIN movie_actor\n" +
                        "WHERE movie.id = ?\n" +
                        "AND movie_actor.movie_id = movie.id\n" +
                        "AND movie_actor.actor_id = actor.id;";
        try(PreparedStatement stmt = con.prepareStatement(sql))
        {
            stmt.setLong(1, movieId);
            try(ResultSet result = stmt.executeQuery())
            {
                while(result.next())
                {
                    Actor actor = new Actor();
                    
                    actor.setId(result.getLong("Id"));
                    actor.setName(result.getString("name"));
                    actors.add(actor);
                }
            }
            catch(Exception re)
            {
                re.printStackTrace();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return actors;
    }
    public static void main(String[] args) {
        MovieDaoImpl dao = new MovieDaoImpl();
        /*
        Movie movie = new Movie();
        movie.setId(7L);
        movie.setName("Test Chnage");
        movie.setGenre("Si-Fi");
        movie.setYear(2015L);
        
        dao.updateMovie(movie);
        */
        /*
        dao.deleteMovieById(8L);
        List<Movie> movies = dao.getAllMovie();
        
        //List<Movie> movies = dao.getMovieById("-1 OR 7");
        for(Movie m : movies)
        {
            System.out.println(m);
        }*/
        List<Actor> actors = dao.getActorsInMovie(1L);
        for(Actor actor : actors)
        {
            System.out.println(actor);
        }
    }

    

    
    
}
