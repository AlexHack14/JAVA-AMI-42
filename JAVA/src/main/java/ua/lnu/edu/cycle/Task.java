package ua.lnu.edu.cycle;

public class Task {

    public static double function(double x) {
        return Math.sin(x) + Math.tan(x);
    }

    public static void tabulation(int a, int b, int h) {
        System.out.println("x : y");
        int count = 0;
        double sum = 0;
        for (int i = a; i < b; i = i + h) {
            double y = function(i);
            System.out.println(i + "  " + y);
            if (y > 0) {
                count++;
                sum += y;
            }
        }
        System.out.println("The number of positive values of the function: " + count);
        System.out.println("The sum of positive values of the function: " + sum);
    }

    public double getS(int n) {
        double s=0;
        if (n <=0) {
            System.out.println("The number is not natural! Please try again");
        } else {
            for(int i=1;i<=2*n;i++) {
                s+= i*(i+1);
            }
        }
        return s;
    }
}
