package com.example.vsfe.item10_11;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Movie {
    private final String movieName;
    private final String director;
    private final String[] actors;

    @Builder
    private Movie(String movieName, String director, String ... actors) {
        this.movieName = movieName;
        this.director = director;
        this.actors = new String[actors.length];
        for(int i = 0; i < actors.length; i++)
            this.actors[i] = actors[i];
    }
}
