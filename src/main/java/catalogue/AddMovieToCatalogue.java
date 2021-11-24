package catalogue;

import exception.MovieArleadyExistsInCatalogueException;
import lombok.RequiredArgsConstructor;
import model.Movie;
import org.springframework.stereotype.Component;
import repository.MovieRepository;

@Component
@RequiredArgsConstructor
public class AddMovieToCatalogue {
    private MovieRepository movieRepository;

    public Movie add(Movie movie)throws MovieArleadyExistsInCatalogueException {
        if(movieRepository.findByTitle(movie.getTitle()).isPresent()){
            throw new MovieArleadyExistsInCatalogueException(movie.getTitle());
        }
        return movieRepository.save(movie);
    }
}
