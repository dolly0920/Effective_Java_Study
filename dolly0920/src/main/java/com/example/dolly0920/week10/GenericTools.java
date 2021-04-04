package com.example.dolly0920.week10;

import java.util.*;

public class GenericTools {

    public static <T extends Comparable<T>> List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }

    public static <T extends Comparable<T>> int lowerBound(List<T> list, T data) {
        Collections.sort(list);

        int result = 0; // index
        int begin = 0;
        int end = list.size();

        while (begin<=end) {
            int mid = (begin + end) / 2;

            if (list.get(mid).compareTo(data) >= 0) {
                end = mid-1;
                result = mid;
            } else { // 작은 경우
                begin = mid+1;
            }
        }
        return result;
    }

    public static <T extends Comparable<T>> int upperBound(List<T> list, T data) {
        Collections.sort(list);

        int result = 0;
        int begin = 0;
        int end = list.size();

        while (begin<=end) {
            int mid = (begin + end) / 2;

            if (list.get(mid).compareTo(data) > 0) {
                end = mid-1;
                result = mid;
            } else {
                begin = mid+1;
            }
        }
        return result;
    }

    public static <T> List<T> combine(List<List<T>> list) {
        List<T> results = new ArrayList<>();
        for (List<T> l : list) {
            for (T e : l) {
                results.add(e);
            }
        }
        return results;
    }
}
