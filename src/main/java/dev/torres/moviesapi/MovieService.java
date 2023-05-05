package dev.torres.moviesapi;

import dev.torres.moviesapi.exception.ResourceNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        if(movieRepository.findByImdbId(imdbId).isEmpty()){
            throw new ResourceNotFoundException("Movies not found");
        }
        return movieRepository.findByImdbId(imdbId);
    }
}
