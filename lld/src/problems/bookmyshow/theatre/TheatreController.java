package problems.bookmyshow.theatre;

import problems.bookmyshow.enums.City;
import problems.bookmyshow.movie.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatres;
    List<Theatre> theatres;

    public TheatreController() {
        cityVsTheatres = new HashMap<>();
        theatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city) {
        theatres.add(theatre);
        List<Theatre> theatres = cityVsTheatres.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatres.put(city, theatres);
    }

    public Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();
        List<Theatre> theatres = cityVsTheatres.get(city);
        for (Theatre theatre : theatres) {
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();
            for (Show show : shows) {
                if (show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if (!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }
        return theatreVsShows;
    }

}
