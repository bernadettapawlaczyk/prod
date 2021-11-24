package usecase;

import catalogue.AddMovieToCatalogue;
import catalogue.ReadMovieFromCatalogue;
import model.Movie;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddMovieToCatalogueTest {
    @Autowired
    private AddMovieToCatalogue addMovieToCatalogue;
    @Autowired private ReadMovieFromCatalogue readMovieFromCatalogue;

    @Test
    void add_new_movie_to_catalogue () throws Exception{

        // given
        Movie movie = new Movie();
        movie.setTitle("Obcy");

        //when
        Movie addedMovie = addMovieToCatalogue.add(movie);
        Movie readMovie = readMovieFromCatalogue.readByTitle(movie.getTitle());

        // then
        Assertions.assertThat(addedMovie).isEqualTo(readMovie);

    }
}
