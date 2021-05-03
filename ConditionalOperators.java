package com.lnu;
import java.util.Scanner;

public class ConditionalOperators {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x, y, z, u, maxAll = 0, minAll = 0, minXz = 0;

    System.out.println("Input x:");
    x = scanner.nextInt();
    System.out.println("Input y:");
    y = scanner.nextInt();
    System.out.println("Input z:");
    z = scanner.nextInt();

    if (x > y) {
      if(x > z) {
        if(y > z) {
          minAll = z;
        } else {
          minAll = y;
        }
        maxAll = x;
        minXz = z;
      } else {
        maxAll = z;
        minAll = y;
        minXz = x;
      }
    } else if (y > z) {
      maxAll = y;

      if(x < z) {
        minAll = x;
        minXz = x;
      } else {
        minAll = z;
        minXz = z;
      }
    }

    if(minAll == 0) {
      throw new RuntimeException("division by 0");
    }
    u = maxAll / minAll + minXz;

    System.out.println("U: " + u);

    double f = f(x);

    System.out.println("F(x): " + f);
  }

  private static double f(int x) {
    if(x >= 0 && x <= 3) {
      return x*x;
    } else {
      return 1/(double)(x*x);
    }
  }
}
