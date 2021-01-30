package com.example.sgkim94.item06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxedStatistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        List<Integer> maximums = new ArrayList<>();

        Integer sum = 0;
        Integer min = 4001;
        Integer max = -4001;
        Integer idx = 0;

        for (int i = 0; i < number; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
            Integer currentNumber = numbers.get(i);

            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }

            sum += currentNumber;
            count.set(currentNumber + 4000, count.get(currentNumber + 4000) + 1);
        }

        Collections.sort(numbers);

        Float average = sum / Float.parseFloat(String.valueOf(number));
        Integer current = 0;
        Integer sizeOfCount = count.size();

        for (int i = 0; i < sizeOfCount; i++) {
            Integer currentCount = count.get(i);
            if (currentCount > current) {
                idx = 0;
                maximums.set(1, 0);

                current = currentCount;
                maximums.set(idx, i - 4000);
                idx++;
            } else if (currentCount.equals(current) && current != 0) {
                maximums.set(idx, i - 4000);
                idx++;
            }
        }

        int maximum;

        if (maximums.get(1) == 0) {
            maximum = maximums.get(0);
        } else {
            maximum = maximums.get(1);
        }

        System.out.println(Math.round(average));
        System.out.println(numbers.get(number / 2));
        System.out.println(maximum);
        System.out.println(max - min);
    }
}
