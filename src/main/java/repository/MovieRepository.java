package repository;

import model.Genre;
import model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public abstract class MovieRepository implements CrudRepository<Movie, Long> {

    public abstract Optional<Movie> findByTitle(String title);

    public abstract Optional<Movie> findByReleaseDate(String releaseDate);

    abstract List<Movie> findAllByGenre(Genre genre);
}
