package com.example.vsfe.Item6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* This Code Passed BOJ Tests with 48020KB, 284ms.
* Since I implemented it with counting sort, I think time gap is bigger if coded using Array.sort()
*/

public class BOJ2108WithAutoBoxing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 9999;
        int mode = 9999;

        for(Integer i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if(max < value) max = value;
            if(min > value) min = value;
        }

        int count = 0;
        int mode_max = 0;
        int size = max + 4000;
        boolean flag = false;


        for(Integer i = min + 4000; i <= size; i++) {
            if(arr[i] > 0) {
                if(count < (N + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }

                else if(mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / N) + " " + median + " " + mode + " " + (max - min));
    }
}
