package ua.edu.lnu.task.cycle;

public class Main {
    public static void main(String[] args) {
        double s = findS(5);
        System.out.println(s);
    }

    //    Протабилювати функцію: y=x2+ex-2*x
    public static void tabulation(int a, int b, int h) {
        double e = 2.718281828459;
        System.out.println("x  :  y");
        int count = 0;
        for (int i = a; i < b; i = i + h) {
            double y = (Math.pow(i, 2) + Math.pow(e, i) - (2 * i));
            System.out.println(i + "    " + y);
            if (y < 10 && y > 0) {
                count++;
            }
        }
        System.out.println("The number of values of the function y: " + count);
    }

    //    Задано натуральне n. Знайти:
    public static double findS(int n) {
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s += Math.pow(-1, i) * (i + 1.0) / ((2.0 * i) + 1.0);
        }
        return s;
    }
}
