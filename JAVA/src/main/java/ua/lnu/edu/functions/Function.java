package ua.lnu.edu.functions;

import java.util.ArrayList;
import java.util.List;

public class Function {

    public boolean isNaturalNumber(int n) {
        if (n <= 0 || n % 1 != 0) return false;
        else return true;
    }

    public int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public void getNumbers(int k, int m, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (sum(arr) == k && arr[i] < m) {
                System.out.println(arr[i]);
            }
        }
    }
}
