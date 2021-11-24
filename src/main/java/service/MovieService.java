package service;

import model.Genre;
import model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public abstract class MovieService {
    public abstract void save(Movie movie);

    public abstract Movie getById(Long id);

    public abstract List<Movie> getAll();

    public abstract void update(Movie movie);

    public abstract void delete(Long id);

    public abstract Movie findByTitle(String title);
    public abstract Movie findByGenre(Genre genre);

    public abstract Movie findByReleaseDate(String releaseDate);

    // Set<Movie> findAllByGenre(Genre genre);
}
