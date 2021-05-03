package com.lnu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input array elements separated with space: ");

    String[] data = in.nextLine().split(" ");
    ArrayList<Double> numbers = new ArrayList<Double>(data.length);
    for (int i = 0; i < data.length; i++) {
      numbers.add(Double.parseDouble(data[i]));
    }

    Collections.sort(numbers);
    double m = Math.ceil(numbers.get(0));
    double M = Math.floor(numbers.get(data.length-1));

    for (int i = (int) m; i <= M; i++) {
      System.out.print(i + " ");
    }
  }
}
