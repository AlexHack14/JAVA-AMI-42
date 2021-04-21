package ua.edu.lnu.task.arrays;

import java.util.Scanner;

/***
 * Дано масиав цілих додатних чисел.Знайти добуток тих елементів,які більші за задане число М.
 * Якщо таких чисел немає,то вивести відповідне повідомлення про це.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 'm':");
        int m = scanner.nextInt();
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            int read = read(scanner);
            myArray[i] = read;
        }
        scanner.close();
        int sum = sum(m, myArray);
        if (sum == 0) {
            System.out.println("Not such numbers!");
        } else {
            System.out.println("sum :" + sum);
        }

    }

    public static int read(Scanner scanner) {
        while (true) {
            int number = scanner.nextInt();
            if (number >= 0) {
                return number;
            }
            System.out.println("Only positive numbers!");
        }
    }


    public static int sum(int m, int[] mas) {
        int result = 0;
        for (int ma : mas) {
            if (ma > m) {
                result = result + ma;
            }
        }
        return result;
    }
}
