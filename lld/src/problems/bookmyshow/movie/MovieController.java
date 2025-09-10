package problems.bookmyshow.movie;

import problems.bookmyshow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> movies;

    public MovieController() {
        this.cityVsMovie = new HashMap<>();
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        movies.add(movie);
        List<Movie> movies = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovie.put(city, movies);
    }

    public Movie getMovieByName(String movieName) {
        for (Movie movie : movies) {
            if ((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovie.get(city);
    }
}
