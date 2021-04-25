package ua.lnu.edu.сonditionaloperator.function;

public class Function {
    public static double function1(double x) {
        return -3 * x + 9;
    }

    public static double function2(double x) {
        return 1 * Math.pow(x - 7, -1);
    }

    public double getResult(double x) {
        if (x > 7) {
            return function2(x);
        } else {
            return function1(x);
        }
    }
}
