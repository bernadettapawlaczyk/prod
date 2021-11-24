package repository;

import model.Movie;
import model.MovieCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieCopyRepository extends CrudRepository<MovieCopy, Long> {
    List<MovieCopy> findAllByMovie(Movie movie);
    List<MovieCopy> findAll();
}
