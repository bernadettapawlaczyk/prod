package repository;

import model.Movie;
import model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ReviewRepository extends CrudRepository<Review, Long> {

    Optional<Review> findByMovie(Movie movie);
}
