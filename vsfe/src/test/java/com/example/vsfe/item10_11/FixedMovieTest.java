package com.example.vsfe.item10_11;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class FixedMovieTest {
    FixedMovie parasite = FixedMovie.builder()
            .movieName("Parasite")
            .director("Bong Joon Ho")
            .actors(new String[]{"Song Kang Ho", "Lee Sun Kyun", "Cho Yeo Jeong", "Choi Woo Shik"})
            .build();

    FixedMovie moreParasite = FixedMovie.builder()
            .movieName("Parasite")
            .director("Bong Joon Ho")
            .actors(new String[]{"Song Kang Ho", "Lee Sun Kyun", "Cho Yeo Jeong", "Choi Woo Shik"})
            .build();

    FixedMovie againParasite = FixedMovie.builder()
            .movieName("Parasite")
            .director("Bong Joon Ho")
            .actors(new String[]{"Song Kang Ho", "Lee Sun Kyun", "Cho Yeo Jeong", "Choi Woo Shik"})
            .build();

    @Test
    void isCorrectEquals() {
        // Reflexivity
        assertEquals(true, parasite.equals(parasite));

        // Symmetry
        assertEquals(true, parasite.equals(againParasite));
        assertEquals(true, againParasite.equals(parasite));

        // Transitivity
        assertEquals(true, parasite.equals(againParasite));
        assertEquals(true, againParasite.equals(moreParasite));
        assertEquals(true, parasite.equals(moreParasite));

        // Not-Null
        assertEquals(false, parasite.equals(null));
    }

    void hashTest() {
        HashSet<FixedMovie> hs = new HashSet<>();
        hs.add(parasite);

        assertEquals(true, hs.contains(againParasite));
        assertEquals(true, hs.contains(moreParasite));
    }
}
