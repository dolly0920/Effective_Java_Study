package com.example.vsfe.item13_14;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieTest {
    Movie movie1 = new Movie("AA", "BBB", new String[] {"A", "B", "C"}, 2020, Nation.KOREA);
    Movie movie2 = new Movie("AA", "BBB", new String[] {"S", "B", "C"}, 2019, Nation.KOREA);
    Movie movie3 = new Movie("BB", "CCC", new String[] {"Y", "O", "N"}, 2015, Nation.KOREA);
    Movie movie4 = new Movie("BB", "DDD", new String[] {"U", "S", "A"}, 2015, Nation.USA);
    Movie movie5 = new Movie("CC", "EEE", new String[] {"J", "B", "C"}, 2020, Nation.KOREA);
    Movie movie6 = new Movie("CC", "EEE", new String[] {"J", "B", "C"}, 2020, Nation.KOREA);

    @Test
    public void compareTest() {
        assertTrue(movie1.compareTo(movie2) > 0);
        assertTrue(movie1.compareTo(movie3) < 0);
        assertTrue(movie3.compareTo(movie4) < 0);
        assertTrue(movie5.compareTo(movie6) == 0);
    }

    @Test
    public void cloneTest() {
        Movie newMovie = movie1.clone();

        assertEquals(false, movie1 == newMovie);

        assertEquals(true, movie1.name.equals(newMovie.name));
        assertEquals(true, movie1.director.equals(newMovie.director));
        assertEquals(false, movie1.staffs.equals(newMovie.staffs));
        assertEquals(true, Arrays.equals(movie1.staffs, newMovie.staffs));

    }
}
