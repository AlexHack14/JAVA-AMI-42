package com.lnu;

import java.util.Scanner;

public class Loops {
  private int a;



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a, b, h, x, result = 1;

    System.out.println("Input a:");
    a = scanner.nextDouble();
    System.out.println("Input b:");
    b = scanner.nextDouble();
    System.out.println("Input h:");
    h = scanner.nextDouble();

    if(a > b) {
      throw new RuntimeException("a > b");
    }

    if(h <= 0) {
      throw new RuntimeException("h <= 0");
    }

    for (double i = a; i <= b; i+=h) {
      System.out.println("y(" + i + ") = " + Math.cos(i) + 1/Math.tan(i));
    }


    System.out.println("Input x:");
    x = scanner.nextDouble();

    for (int i = 2; i <= 64; i*=2) {
      result *= (x-i-1)/(x-i);
    }

    System.out.println("Result: " + result);
  }
}
