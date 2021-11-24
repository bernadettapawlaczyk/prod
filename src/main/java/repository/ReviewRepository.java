package repository;

import model.Movie;
import model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public abstract class ReviewRepository implements CrudRepository<Review, Long> {

    abstract Optional<Review> findByMovie(Movie movie);
}
