package com.example.sypark9646.item21;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FunctionalInterfaceTest {

    static Integer calculate(Calculation operation, Integer x, Integer y) {
        return operation.apply(x, y);
    }

    @DisplayName("functional interface test - lambda")
    @Test
    void calculate() {
        // 람다 생성
        Calculation addition = (x, y) -> x + y;
        Calculation subtraction = (x, y) -> x - y;

        Assertions.assertAll(
            // 사용
            () -> Assertions.assertEquals(4, calculate(addition, 2, 2)),
            () -> Assertions.assertEquals(0, calculate(subtraction, 5, calculate(addition, 3, 2)))
        );
    }

//    @DisplayName("functional interface test - throws checked Exception")
//    void bufferedReaderProcessor() {
//        BufferedReaderProcessor bufferedReaderProcessor = BufferedReader::readLine;
//    }


    @DisplayName("Fuction functional interface with try-catch")
    @Test
    void function() {
        Function<BufferedReader, String> func = (BufferedReader b) -> {
            try {
                return b.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
