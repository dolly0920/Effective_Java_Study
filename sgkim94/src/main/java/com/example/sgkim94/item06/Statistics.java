package com.example.sgkim94.item06;

import java.io.*;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int[] numbers = new int[number];
        int[] count = new int[8001];
        int[] maximums = new int[8001];

        int sum = 0;
        int min = 4001;
        int max = -4001;
        int idx = 0;

        for (int i = 0; i < number; i++) {
            numbers[i] = Integer.parseInt(br.readLine());

            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }

            sum += numbers[i];
            count[numbers[i] + 4000]++;
        }

        Arrays.sort(numbers);

        float average = sum / (float) number;
        int current = 0;
        int sizeOfCount = count.length;

        for (int i = 0; i < sizeOfCount; i++) {
            if (count[i] > current) {
                idx = 0;
                maximums[1] = 0;

                current = count[i];
                maximums[idx] = i - 4000;
                idx++;
            } else if (count[i] == current && current != 0) {
                maximums[idx] = i - 4000;
                idx++;
            }
        }

        int maximum;

        if (maximums[1] == 0) {
            maximum = maximums[0];
        } else {
            maximum = maximums[1];
        }

        System.out.println(Math.round(average));
        System.out.println(numbers[number / 2]);
        System.out.println(maximum);
        System.out.println(max - min);
    }
}
