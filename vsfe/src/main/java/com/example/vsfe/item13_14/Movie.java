package com.example.vsfe.item13_14;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie implements Cloneable {
    String name;
    String director;
    String[] staffs;
    int release_year;
    Nation nation;

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
