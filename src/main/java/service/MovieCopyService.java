package service;

import model.MovieCopy;
import org.springframework.stereotype.Service;

@Service
public abstract class MovieCopyService {
    public abstract void save(MovieCopy movieCopy);
}
