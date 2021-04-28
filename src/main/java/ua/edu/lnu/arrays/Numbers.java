package ua.edu.lnu.arrays;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private int findMinElement(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    min = arr[i];
                }
            }
        }
        return min;
    }

    public List<Integer> getResult(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = findMinElement(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
