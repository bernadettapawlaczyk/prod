package service.impl;

import model.MovieCopy;
import org.springframework.stereotype.Service;
import repository.MovieCopyRepository;
import service.MovieCopyService;
@Service
public class MovieCopyServiceImpl implements MovieCopyService {
    private MovieCopyRepository movieCopyRepository;

    @Override
    public void save(MovieCopy movieCopy) {

    }
}
