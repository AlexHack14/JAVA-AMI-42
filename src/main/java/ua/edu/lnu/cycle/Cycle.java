package ua.edu.lnu.cycle;

public class Cycle {

    private final static double e = 2.71828;

    private double f(double e, double x) {
        return Math.pow(x, 2) + Math.pow(e, x) - 2 * x;
    }

    private boolean isNatural(double number) {
        return (number >= 0.0 && Math.floor(number) == number) ? true : false;
    }

    public void tabulation(int a, int b, int h) {
        System.out.println("x : y");
        int count = 0;
        double sum = 0;
        for (int i = a; i < b; i = i + h) {
            double y = f(e, i);
            System.out.println(i + "  " + y);
            if (y > 5 && y < 10) {
                count++;
                sum += y;
            }
        }
        double average = sum / count;
        if (Double.isNaN(average) || Double.isInfinite(average)) {
            System.out.println("No values of the function in the range 5 to 10");
        } else {
            System.out.println("the arithmetic mean of the values of the function" +
                    " for which the condition is fulfilled 5 < y < 10: " + average);
        }

    }

    public double getS(double n) {
        double S = 0;
        if (!isNatural(n)) {
            System.out.print("The number is not natural. Try again,please!");
        } else {
            for (int i = 0; i <= 2 * n; i++) {
                S += Math.pow(n + i, 2);
            }
        }
        return S;
    }
}
