package com.example.vsfe.item10_11;

import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;

@Getter
public class FixedMovie {
    private final String movieName;
    private final String director;
    private final String[] actors;

    @Builder
    private FixedMovie(String movieName, String director, String ... actors) {
        this.movieName = movieName;
        this.director = director;
        this.actors = new String[actors.length];
        for(int i = 0; i < actors.length; i++)
            this.actors[i] = actors[i];
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof FixedMovie))
            return false;

        FixedMovie fm = (FixedMovie) o;
        return this.movieName == fm.movieName && this.director == fm.director
                && Arrays.equals(this.actors, fm.actors);
    }

    @Override
    public int hashCode() {
        int result = movieName.hashCode();

        result = 31 * result + director.hashCode();

        for(String actor: actors) {
            result = 31 * result + actor.hashCode();
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder()
                .append("Movie Name: ").append(movieName)
                .append("Director: ").append(director)
                .append("Actors: ");
        for(String actor: actors) {
            temp.append(actor).append(", ");
        }
        return temp.toString();
    }

}
