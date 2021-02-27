package com.example.sypark9646.item17.utils;

import java.util.Random;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtils {

    private static Random random = new Random();

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}
