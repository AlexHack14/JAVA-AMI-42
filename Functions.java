package com.lnu;

import java.util.Scanner;

public class Functions {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Input n:");
    n = scanner.nextInt();

    for (int i = (int) Math.pow(10, n); i < (int) Math.pow(10, n+1); i++) {
      if(isNumberStrongIncreasing(i)) {
        System.out.print(i + " ");
      }
    }
  }

  private static boolean isNumberStrongIncreasing(int num) {
    int currentDigit = num % 10;
    num = num/10;

    while(num>0){
      if(currentDigit <= num % 10){
        return false;
      }

      currentDigit = num % 10;
      num = num/10;
    }
    return true;
  }
}
