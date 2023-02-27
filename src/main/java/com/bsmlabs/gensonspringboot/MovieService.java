package com.bsmlabs.gensonspringboot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private static final List<Movie> movieDetails = new ArrayList<>();

    static {
        Movie movieOne = new Movie("M1", "The Guide", LocalDateTime.now());

        Movie movieTwo = new Movie("M2", "Home Alone", LocalDateTime.now().plusHours(1));

        Movie movieThree = new Movie("M3", "Safe Haven", LocalDateTime.now().plusHours(2));

        movieDetails.add(movieOne);
        movieDetails.add(movieTwo);
        movieDetails.add(movieThree);
    }

    public List<Movie> retrieveAllMovies() {
        return movieDetails;
    }

    public Movie retrieveStudent(String movieId) {
        return movieDetails.stream()
                .filter(movie -> movie.getMoveId().equals(movieId))
                .findAny()
                .orElse(null);

    }
}
