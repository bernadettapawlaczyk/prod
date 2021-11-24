package repository;

import model.CopyStatus;
import model.Genre;
import model.Movie;
import model.MovieCopy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class MovieRepositoryTest {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieCopyRepository copyRepository;

    private static Long expectedId;

    @BeforeAll
    public static void init(){
        expectedId = 1L;
    }


    // 1
    @Test
    public void saves_and_loads_movie() {

        //given
        String title = "Obcy";

        Movie m1 = new Movie();
        m1.setTitle(title);
        m1.setReleaseDate(LocalDate.of(2020, 1, 11));

        Optional<Movie> foundMovieOptional = movieRepository.findByTitle(title);
        Assertions.assertThat(foundMovieOptional.isEmpty()).isTrue();

        //when
        movieRepository.save(m1);
        foundMovieOptional = movieRepository.findByTitle(title);

        //then
        Assertions.assertThat(foundMovieOptional.isPresent()).isTrue();
        Movie foundMovie = foundMovieOptional.get();
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(m1.getTitle());
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(m1.getReleaseDate());

    }

    // 2
    @Test
    public void finds_movie_by_genre () {

        //given
        Genre gatunekFilmu2 = Genre.COMEDY;
        String title2 = "Killer";

        Movie movie2 = new Movie();
        movie2.setTitle(title2);
        movie2.setReleaseDate(LocalDate.of(2020, 1, 11));
        movie2.setGenre(gatunekFilmu2);

        List<Movie> foundMoviesList = movieRepository.findAllByGenre(gatunekFilmu2);
        Assertions.assertThat(foundMoviesList.isEmpty()).isTrue();

        //when
        movieRepository.save(movie2);
        foundMoviesList = movieRepository.findAllByGenre(gatunekFilmu2);

        //then
        Assertions.assertThat(foundMoviesList.isEmpty()).isFalse();
        Assertions.assertThat(foundMoviesList.size()).isEqualTo(1);

        Movie foundMovie = foundMoviesList.get(0);

        Assertions.assertThat(foundMovie).isNotNull();

        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(title2);
        Assertions.assertThat(foundMovie.getGenre()).isEqualTo(gatunekFilmu2);
    }

    // 3
    @Test
    public void saves_movie_and_related_copies(){
        // given
        String title3 = "Psy";

        Movie movie3 = new Movie();
        movie3.setTitle(title3);
        movie3.setReleaseDate(LocalDate.of(2020,1,2));

        MovieCopy movieCopy1 = new MovieCopy();
        movieCopy1.setCopyStatus(CopyStatus.AVALABLE);
        movieCopy1.setMovie(movie3);

        MovieCopy movieCopy2 = new MovieCopy();
        movieCopy2.setMovie(movie3);
        movieCopy2.setCopyStatus(CopyStatus.RENTED);

        List<MovieCopy> copies = new ArrayList<>();
        copies.add(movieCopy1);
        copies.add(movieCopy2);

        movie3.setCopies(copies);

        Optional<Movie> addedMovieOptional = movieRepository.findByTitle(title3);
        Assertions.assertThat(addedMovieOptional.isEmpty()).isTrue();

        movieRepository.save(movie3);
        addedMovieOptional = movieRepository.findByTitle(title3);
        Assertions.assertThat(addedMovieOptional.isPresent()).isTrue();
        Movie addedMovie = addedMovieOptional.get();

        List<MovieCopy> foundCopies = copyRepository.findAll();

        Assertions.assertThat(addedMovie.getTitle()).isEqualTo(movie3.getTitle());
        Assertions.assertThat(addedMovie.getReleaseDate()).isEqualTo(movie3.getReleaseDate());
        Assertions.assertThat(foundCopies.isEmpty()).isFalse();
    }

    // 4
    @Test
    public void find_movie_by_release_date() {

       /* LocalDate premiera = LocalDate.of(2020,11,22);
        String title4 = "Bejn and Bejn";

        // given
        Movie moviePremiere = new Movie();
        moviePremiere.setTitle(title4);
        moviePremiere.setReleaseDate(premiera);

        List<Movie> foundMoviesList = movieRepository.findByReleaseDate(premiera);
        Assertions.assertThat(foundMoviesList.isEmpty()).isTrue();

        // when
        movieRepository.save(moviePremiere);
        foundMoviesList = movieRepository.findByReleaseDate(premiera);

        // then
        Assertions.assertThat(foundMoviesList.isEmpty()).isFalse();


        Movie foundMovie = foundMoviesList.get(0);

        Assertions.assertThat(foundMovie).isNotNull();
        Assertions.assertThat(foundMovie.getTitle()).isEqualTo(title4);
        Assertions.assertThat(foundMovie.getReleaseDate()).isEqualTo(premiera);

        */
    }
}
