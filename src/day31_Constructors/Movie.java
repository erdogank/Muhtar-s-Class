package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director, cast;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +

                ", numberOfCasts=" + casts.size() +
                '}';
    }

    public void addCast(String cast){

       casts.add(cast);
    }
    public void addCasts(){
        casts.addAll(Arrays.asList());
    }
}
