package com.example.dolly0920.item6;

import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        int[] count = new int[8001]; // input range -4000 ~ 4000. array for number count
        Scanner sc = new Scanner(System.in);

        int middle = 0;
        int frequent = 0;

        int N = sc.nextInt(); // input number

        int sum = 0; // sum (Integer type => autoboxing)
        int min = 4001; // min value
        int max = -4001; // max value

        for (int i=0; i<N; i++) {
            int value = sc.nextInt(); // INPUT ( -4000 ~ 4000 )
            sum += value;
            count[value+4000]++; // plus 4000 for negative num

            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        int max_appearance = 0;
        int order = 0; // for middle value
        boolean flag = true; // for duplicate value (second value)

        for (int i=min+4000; i<=max+4000; i++) {
            if (count[i]>0) { // exist num
                if (order < (N+1)/2) { // for middle value
                    order += count[i];
                    middle = i-4000;
                }

                if (count[i] > max_appearance) {
                    max_appearance = count[i];
                    frequent = i-4000;
                    flag = true;
                } else if (count[i] == max_appearance && flag==true) {
                    flag = false;
                    frequent = i-4000;
                }
            }
        }

        System.out.println((int) Math.round((double) sum/N));
        System.out.println(middle);
        System.out.println(frequent);
        System.out.println(max-min);
    }
}
