package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@Getter
@Setter
public class Movie {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Genre genre;
    private LocalDate releaseDate;
    private String description;

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;

    @OneToMany(orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "movie")

    private List<MovieCopy> copies;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
