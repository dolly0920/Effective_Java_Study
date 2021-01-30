package com.example.sypark9646.item6;

import java.util.*;

public class BoxedBOJ2108 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(calcAverage(arr));
		System.out.println(findMedian(arr));
		System.out.println(findMode(arr));
		System.out.println(findRange(arr));
	}

	public static Integer calcAverage(int[] arr) {
		Integer sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (int) Math.round(sum / (double) arr.length);
	}

	public static Integer findMedian(int[] arr) {
		return arr[arr.length / 2];
	}

	public static Integer findMode(int[] arr) {
		Integer frequency = 1;
		Integer modeFrequency = 1;
		Integer before = arr[0];
		TreeSet<Integer> answer = new TreeSet<>();

		for (int i = 1; i < arr.length; i++) {
			if (before == arr[i]) {
				frequency++;
			} else {
				if (modeFrequency < frequency) {
					answer.clear();
					modeFrequency = frequency;
					answer.add(before);
				} else if (modeFrequency.equals(frequency)) {
					answer.add(before);
				}

				frequency = 1;
				before = arr[i];
			}
		}

		if (modeFrequency < frequency) {
			answer.clear();
			answer.add(before);
		} else if (modeFrequency.equals(frequency)) {
			answer.add(before);
		}

		Integer smallest = answer.pollFirst();
		if (answer.size() > 0) {
			smallest = answer.pollFirst();
		}
		return smallest;
	}

	public static Integer findRange(int[] arr) {
		return arr[arr.length - 1] - arr[0];
	}
}
