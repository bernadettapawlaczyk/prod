package catalogue;

import lombok.RequiredArgsConstructor;
import model.Movie;
import org.springframework.stereotype.Component;
import repository.MovieRepository;

@Component
@RequiredArgsConstructor
public class ReadMovieFromCatalogue {
    private MovieRepository movieRepository;

    public Movie readByTitle(String title) throws Exception{
        return movieRepository.findByTitle(title)
                .orElseThrow(MovieDoesNotExistsCatalogue::new);
    }
}
