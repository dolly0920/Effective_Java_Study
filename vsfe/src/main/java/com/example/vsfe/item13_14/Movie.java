package com.example.vsfe.item13_14;

import lombok.AllArgsConstructor;

import java.util.Comparator;

import static java.util.Comparator.comparing;

@AllArgsConstructor
public class Movie implements Cloneable, Comparable<Movie> {
    String name;
    String director;
    String[] staffs;
    int release_year;
    Nation nation;

    private static final Comparator<Movie> COMPARATOR =
            comparing((Movie mv) -> mv.name)
            .thenComparingInt(mv -> mv.release_year)
            .thenComparing(mv -> mv.director)
            .thenComparing(mv -> mv.nation);

    @Override
    public int compareTo(Movie o) {
        return COMPARATOR.compare(this, o);
    }

    @Override
    public Movie clone() {
        try {
            Movie result = (Movie) super.clone();
            result.staffs = staffs.clone();
            return result;
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
