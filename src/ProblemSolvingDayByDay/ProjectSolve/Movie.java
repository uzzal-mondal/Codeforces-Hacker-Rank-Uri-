package ProblemSolvingDayByDay.ProjectSolve;

import java.util.Scanner;

public class Movie {
    private String movieTitle;
    private String movieDis;
    private int year;

    public Movie() {

    }

    public Movie(String movieTitle, String movieDis, int year) {
        this.movieTitle = movieTitle;
        this.movieDis = movieDis;
        this.year = year;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDis() {
        return movieDis;
    }

    public void setMovieDis(String movieDis) {
        this.movieDis = movieDis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "movieTitle = " + movieTitle + '\n' +
                "movieDis = " + movieDis + '\n' +
                "year =" + year;
    }
}
