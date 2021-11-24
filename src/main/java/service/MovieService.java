package service;

import model.Genre;
import model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    void save(Movie movie);
    Movie getById(Long id);
    List<Movie> getAll();

    void update(Movie movie);

    void delete (Long id);

    Movie findByTitle(String title);
    Movie findByGenre(Genre genre);
    Movie findByReleaseDate(String releaseDate);

    // Set<Movie> findAllByGenre(Genre genre);
}
