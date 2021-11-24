package service.impl;

import model.Movie;
import org.springframework.stereotype.Service;
import repository.MovieRepository;
import service.MovieService;

import java.util.LinkedList;
import java.util.List;

@Service
public abstract class MovieServiceImpl extends MovieService {
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public Movie getById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> getAll() {
        List<Movie> movies = new LinkedList<>();
        movieRepository.findAll().iterator().forEachRemaining(movies::add);
        return movies;
    }

    @Override
    public void update(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie findByTitle(String title) {
        return movieRepository.findByTitle(title).orElse(null);
    }

    /*
        @Override
        public Movie findByGenre (Genre genre){
            return movieRepository.findByGenre(genre).orElse(null);
        }
     */

    @Override
    public Movie findByReleaseDate(String releaseDate) {
        return movieRepository.findByReleaseDate(releaseDate).orElse(null);
    }

    /*@Override
    public Set<Movie> findAllByGenre(Genre genre) {
        return movieRepository.findAllByGenre(genre);
    }

     */
}
