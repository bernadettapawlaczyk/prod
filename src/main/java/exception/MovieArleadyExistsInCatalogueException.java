package exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MovieArleadyExistsInCatalogueException extends Exception{
    public MovieArleadyExistsInCatalogueException(String title) {
        super(title + "Arleady exists in catalogue");
    }
}
