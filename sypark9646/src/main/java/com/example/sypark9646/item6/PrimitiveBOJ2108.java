package com.example.sypark9646.item6;

import java.util.*;

public class PrimitiveBOJ2108 {

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

	public static int calcAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (int) Math.round(sum / (double) arr.length);
	}

	public static int findMedian(int[] arr) {
		return arr[arr.length / 2];
	}

	public static int findMode(int[] arr) {
		int frequency = 1;
		int modeFrequency = 1;
		int before = arr[0];
		TreeSet<Integer> answer = new TreeSet<Integer>();

		for (int i = 1; i < arr.length; i++) {
			//System.out.println(arr[i]+" "+answer+" "+frequency+" "+before+" "+modeFrequency);

			if (before == arr[i]) {
				frequency++;
			} else {
				if (modeFrequency < frequency) {
					answer.clear();
					modeFrequency = frequency;
					answer.add(before);
				} else if (modeFrequency == frequency) {
					answer.add(before);
				}

				frequency = 1;
				before = arr[i];
			}
		}

		if (modeFrequency < frequency) {
			answer.clear();
			modeFrequency = frequency;
			answer.add(before);
		} else if (modeFrequency == frequency) {
			answer.add(before);
		}

		//System.out.println(answer);
		int smallest = answer.pollFirst();
		if (answer.size() > 0) {
			smallest = answer.pollFirst();
		}
		return smallest;
	}

	public static int findRange(int[] arr) {
		return arr[arr.length - 1] - arr[0];
	}
}
