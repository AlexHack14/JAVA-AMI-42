package com.lnu.home;

import java.util.ArrayList;
import java.util.Random;

public class FunctionsMatrix {

    private double generateElement() {
        int min_interval = -100;
        int max_interval = 300;
        int diff = max_interval + min_interval;

        Random randomSeed = new Random();
        int i = randomSeed.nextInt(diff + 1);

        return i + min_interval;
    }

    private double[][] generateMatrix(int rows, int columns) {
        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = generateElement();
            }
        }

        printMatrix(matrix);
        return matrix;
    }

    private int getTotalPositiveNumbers(double[][] matrix) {
        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    total += 1;
                }
            }
        }
        return total;
    }

    private int getTheBiggestTotal(int t1, int t2, int t3) {
        ArrayList<Integer> totals = new ArrayList<>();
        totals.add(t1);
        totals.add(t2);
        totals.add(t3);
        int max = t1;

        for (int total : totals) {
            if (total > max) {
                max = total;
            }
        }

        return totals.indexOf(max);
    }

    public void compareTreeMatrix(int rows, int columns) {
        double[][] matrix1 = generateMatrix(rows, columns);
        double[][] matrix2 = generateMatrix(rows, columns);
        double[][] matrix3 = generateMatrix(rows, columns);

        int total1 = getTotalPositiveNumbers(matrix1);
        int total2 = getTotalPositiveNumbers(matrix2);
        int total3 = getTotalPositiveNumbers(matrix3);

        System.out.println("MATRIX with the biggest number of positive numbers is MATRIX#" + getTheBiggestTotal(total1, total2, total3));
    }

    private void printMatrix(double[][] matrix) {

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
