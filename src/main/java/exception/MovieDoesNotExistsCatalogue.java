package exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieDoesNotExistsCatalogue extends Exception{

    public MovieDoesNotExistsCatalogue(String title) {
        super(title + "does not exist in catalogue");
    }
}
