package com.bsmlabs.gensonspringboot;

import java.time.LocalDateTime;
import java.util.Objects;

public class Movie {

    private String moveId;
    private String movieName;
    private String showTime;

    public Movie(String moveId, String movieName, String showTime) {
        this.moveId = moveId;
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public String getMoveId() {
        return moveId;
    }

    public void setMoveId(String moveId) {
        this.moveId = moveId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(moveId, movie.moveId) && Objects.equals(movieName, movie.movieName) && Objects.equals(showTime, movie.showTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveId, movieName, showTime);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "moveId='" + moveId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", showTime=" + showTime +
                '}';
    }

}
