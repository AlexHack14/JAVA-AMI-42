package ua.edu.lnu.task.conditionaloperator.function;

/***
 * Для даного  х обчислити значення функції:
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(result(3.2));
    }

    public static double result(double number) {
        if (number < 3.2) {
            return function1(number);
        } else if (number >= 3.2) {
            return function2(number);
        }
        return 0;
    }

    private static double function1(double number) {
        return Math.pow(number, 2) + 9;
    }

    private static double function2(double number) {
        return (54 * Math.pow(number, 4)) / (-5 * Math.pow(number, 2) + 7);
    }
}
