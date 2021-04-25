package ua.lnu.edu;

import ua.lnu.edu.abstractclass.Figure;
import ua.lnu.edu.abstractclass.Parallelepiped;
import ua.lnu.edu.abstractclass.Tetrahedron;
import ua.lnu.edu.arrays.Number;
import ua.lnu.edu.classes.House;
import ua.lnu.edu.cycle.Task;
import ua.lnu.edu.сonditionaloperator.function.Function;
import ua.lnu.edu.сonditionaloperator.point.Point;
import ua.lnu.edu.сonditionaloperator.point.Result;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("\nMenu:\n");
        System.out.println("'1' - Function");
        System.out.println("'2' - Find the nearest point to A");
        System.out.println("'3' - Tabulation");
        System.out.println("'4' - Find S = 1*2 + 2*3 +...+ n(n+1) *...* 2n");
        System.out.println("'5' - Get the elements of the array in which the remainder of the division by M is equal to L");
        System.out.println("'6' - Print numbers in which the sum of digits is equal to K and which is not greater than M.");
        System.out.println("'7' - Class");
        System.out.println("'8' - Abstract class");
        System.out.println("'Q' - Exit");
        System.out.print("Please, select menu point: ");
    }

    private static void outputMenu() {
        boolean exit = true;
        while (exit) {
            printMenu();
            switch (input.next()) {
                case "1": {
                    printFunction();
                    break;
                }
                case "2": {
                    printTheNearestPoint();
                    break;
                }
                case "3": {
                    printTabulation();
                    break;
                }
                case "4": {
                    printS();
                    break;
                }
                case "5": {
                    printArray();
                    break;
                }
                case "6": {
                    printNumbers();
                    break;
                }
                case "7": {
                    printHouse();
                    break;
                }
                case "8": {
                    printVolume();
                    break;
                }
                case "Q": {
                    exit = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    private static void printFunction() {
        Function function = new Function();
        System.out.print("Enter number:");
        double x = input.nextDouble();
        System.out.print("F(x) = " + function.getResult(x));

    }

    private static void printTheNearestPoint() {
        System.out.println("Enter coordinate for A:");
        System.out.print("x:");
        int xA = input.nextInt();
        System.out.print("y:");
        int yA = input.nextInt();
        Point A = new Point(xA, yA);
        System.out.println("Enter coordinate for B:");
        System.out.print("x:");
        int xB = input.nextInt();
        System.out.print("y:");
        int yB = input.nextInt();
        Point B = new Point(xB, yB);
        System.out.println("Enter coordinate for C:");
        System.out.print("x:");
        int xC = input.nextInt();
        System.out.print("y:");
        int yC = input.nextInt();
        Point C = new Point(xC, yC);
        Result result = new Result();
        result.getTheNearestPointToA(A, B, C);
    }

    private static void printTabulation() {
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.println("[a,b]: " + "[" + a + ", " + b + "]");
        System.out.print("Enter step h:");
        int h = input.nextInt();
        Task task = new Task();
        task.tabulation(a, b, h);
    }

    private static void printS() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        Task task = new Task();
        System.out.println("S = " + task.getS(n));
    }

    private static void printArray() {
        int arr[] = {-25, 32, -4, 0, 7, 4, -4, 25, 26};
        System.out.println(Arrays.toString(arr));
        Number number = new Number();
        number.getSomeElementsOfArray(arr);
    }

    private static void printNumbers() {
        int arr[] = {-25, 32, -4, 0, 7, 4, -4, 25, 26};
        ua.lnu.edu.functions.Function f = new ua.lnu.edu.functions.Function();
        System.out.print("Enter M: ");
        int M = input.nextInt();
        System.out.print("Enter K: ");
        int K = input.nextInt();
        if (!f.isNaturalNumber(M) && !f.isNaturalNumber(K)) {
            System.out.println("M and K not natural numbers. Try again please!");
        } else {
            f.getNumbers(K, M, arr);
        }

    }

    private static void filter(House[] houses) {
        Arrays.stream(houses)
                .filter(house -> house.getPrice().compareTo(new BigDecimal(3)) == 1)
                .forEach(house -> house.getPriceForHouse(house.getSquare(), house.getPrice()));
    }

    private static void printHouse() {
        House house1 = new House(243, "Lviv", 500.0, new BigDecimal(4));
        House house2 = new House(43, "Odessa", 100.0, new BigDecimal(1.5));
        House house3 = new House(2, "Ternopil", 250.0, new BigDecimal(0.5));
        House[] houses = {house1, house2, house3};

        filter(houses);
    }


    private static void printVolume() {
        Figure parallelepiped = new Parallelepiped();
        Figure tetrahedron = new Tetrahedron();
        System.out.println("The volume of parallelepiped: " + parallelepiped.volume(3, 4, 5));
        System.out.println("The volume of tetrahedron: " + tetrahedron.volume(3, 3, 3));
    }

    public static void main(String[] args) {
        outputMenu();
    }
}
