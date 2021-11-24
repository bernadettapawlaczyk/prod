package repository;

import model.Movie;
import model.MovieCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class MovieCopyRepository implements CrudRepository<MovieCopy, Long> {
    abstract List<MovieCopy> findAllByMovie(Movie movie);
    public abstract List<MovieCopy> findAll();
}
