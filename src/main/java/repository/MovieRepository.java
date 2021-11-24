package repository;

import model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MovieRepository extends CrudRepository<Movie, Long> {

    Optional<Movie> findByTitle(String title);

    Optional<Movie> findByReleaseDate(String releaseDate);

    List<Movie> findAllByGenre(Genre genre);}
